CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    name VARCHAR2(50),
    age NUMBER,
    balance NUMBER(10, 2),
    is_vip VARCHAR2(3) DEFAULT 'NO'
);

CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    interest_rate NUMBER(5, 2),
    due_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO customers (customer_id, name, age, balance) VALUES (1, 'John Doe', 65, 5000);
INSERT INTO customers (customer_id, name, age, balance) VALUES (2, 'Jane Smith', 30, 15000);
INSERT INTO customers (customer_id, name, age, balance) VALUES (3, 'Bob Johnson', 72, 20000);
INSERT INTO customers (customer_id, name, age, balance) VALUES (4, 'Alice Brown', 45, 8000);

INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (101, 1, 10.5, SYSDATE + 15);
INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (102, 2, 7.0, SYSDATE + 60);
INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (103, 3, 9.0, SYSDATE + 20);
COMMIT;


--apply a 1% discount to their current loan interest rates
BEGIN
    FOR rec IN (
        SELECT c.customer_id, c.name, c.age, l.loan_id, l.interest_rate
        FROM customers c
        JOIN loans l ON c.customer_id = l.customer_id
    ) LOOP
        IF rec.age > 60 THEN
            UPDATE loans
            SET interest_rate = interest_rate - 1.0
            WHERE loan_id = rec.loan_id;
            
            DBMS_OUTPUT.PUT_LINE('Applied 1% discount to ' || rec.name || '. New Rate: ' || (rec.interest_rate - 1.0) || '%');
        END IF;
    END LOOP;
    COMMIT;
END;
/
--Iterate through all customers and set a flag IsVIP
to TRUE for those with a balance over $10,000.
BEGIN
    FOR rec IN (SELECT customer_id, name, balance FROM customers) LOOP
        IF rec.balance > 10000 THEN
            UPDATE customers
            SET is_vip = 'YES'
            WHERE customer_id = rec.customer_id;
            
            DBMS_OUTPUT.PUT_LINE(rec.name || ' has been promoted to VIP.');
        END IF;
    END LOOP;
    
    COMMIT;
END;
/
--Fetch all loans due in the next 30 days and print a reminder message for each customer.
BEGIN
    FOR rec IN (
        SELECT c.name,
               l.loan_id,
               l.due_date
        FROM customers c
        JOIN loans l
            ON c.customer_id = l.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan '
            || rec.loan_id
            || ' for '
            || rec.name
            || ' is due on '
            || TO_CHAR(rec.due_date, 'DD-MON-YYYY')
        );

    END LOOP;
END;