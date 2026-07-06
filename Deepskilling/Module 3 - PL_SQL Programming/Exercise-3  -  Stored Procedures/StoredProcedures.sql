CREATE TABLE savings_accounts (
                                  account_id NUMBER PRIMARY KEY,
                                  customer_name VARCHAR2(50),
                                  balance NUMBER(10, 2)
);

CREATE TABLE employees (
                           emp_id NUMBER PRIMARY KEY,
                           emp_name VARCHAR2(50),
                           department VARCHAR2(50),
                           salary NUMBER(10, 2)
);

CREATE TABLE bank_accounts (
                               account_id NUMBER PRIMARY KEY,
                               customer_name VARCHAR2(50),
                               balance NUMBER(10, 2)
);

INSERT INTO savings_accounts VALUES (1, 'Alice', 5000.00);
INSERT INTO savings_accounts VALUES (2, 'Bob', 10000.00);

INSERT INTO employees VALUES (101, 'John Doe', 'IT', 4000.00);
INSERT INTO employees VALUES (102, 'Jane Smith', 'HR', 3500.00);
INSERT INTO employees VALUES (103, 'Sam Brown', 'IT', 4500.00);

INSERT INTO bank_accounts VALUES (1001, 'Checking Acct', 3000.00);
INSERT INTO bank_accounts VALUES (1002, 'Savings Acct', 5000.00);

COMMIT;

--ProcessMonthlyInterest Procedure
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
UPDATE savings_accounts
SET balance = balance + (balance * 0.01);

DBMS_OUTPUT.PUT_LINE('Scenario 1: Monthly interest of 1% applied to all savings accounts.');
END;
/
-- UpdateEmployeeBonus Procedure
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
) IS
BEGIN
UPDATE employees
SET salary = salary + (salary * (p_bonus_percent / 100))
WHERE department = p_department;

DBMS_OUTPUT.PUT_LINE('Scenario 2: Bonus of ' || p_bonus_percent || '% applied to ' || p_department || ' department.');
END;
/
-- TransferFunds Procedure
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
) IS
    v_source_balance NUMBER(10, 2);
BEGIN
SELECT balance INTO v_source_balance
FROM bank_accounts
WHERE account_id = p_from_account;
IF v_source_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Scenario 3: Transfer Failed - Insufficient funds in Account ' || p_from_account);
ELSE
UPDATE bank_accounts SET balance = balance - p_amount WHERE account_id = p_from_account;
UPDATE bank_accounts SET balance = balance + p_amount WHERE account_id = p_to_account;

DBMS_OUTPUT.PUT_LINE('Scenario 3: Transfer Successful - ' || p_amount || ' moved from Account ' || p_from_account || ' to Account ' || p_to_account);
COMMIT;
END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Scenario 3: Error - Source Account ' || p_from_account || ' does not exist.');
END;
/
--EXECUTE PROCEDURES AND TEST
SET SERVEROUTPUT ON;
EXECUTE ProcessMonthlyInterest();
EXECUTE UpdateEmployeeBonus('IT', 10);
EXECUTE TransferFunds(1002, 1001, 1000);
EXECUTE TransferFunds(1001, 1002, 5000);

-- RETRIEVE FINAL DATA TO VERIFY CHANGES
DBMS_OUTPUT.PUT_LINE('--- Final Data Verification ---');

DBMS_OUTPUT.PUT_LINE('Savings Accounts (Balances should be 1% higher):');
FOR rec IN (SELECT account_id, customer_name, balance FROM savings_accounts) LOOP
    DBMS_OUTPUT.PUT_LINE('Acct ' || rec.account_id || ' | ' || rec.customer_name || ' | $' || rec.balance);
END LOOP;

DBMS_OUTPUT.PUT_LINE('Employees (IT salaries should be 10% higher):');
FOR rec IN (SELECT emp_id, emp_name, department, salary FROM employees) LOOP
    DBMS_OUTPUT.PUT_LINE('ID ' || rec.emp_id || ' | ' || rec.emp_name || ' | ' || rec.department || ' | $' || rec.salary);
END LOOP;

DBMS_OUTPUT.PUT_LINE('Bank Accounts (1002 should have 4000, 1001 should have 4000):');
FOR rec IN (SELECT account_id, customer_name, balance FROM bank_accounts) LOOP
    DBMS_OUTPUT.PUT_LINE('Acct ' || rec.account_id || ' | ' || rec.customer_name || ' | $' || rec.balance);
END LOOP;
/