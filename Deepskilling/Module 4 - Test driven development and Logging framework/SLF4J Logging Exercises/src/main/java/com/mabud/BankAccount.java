package com.mabud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private int balance;
    private static final Logger logger=LoggerFactory.getLogger(BankAccount.class);
    BankAccount(int amount){
        this.balance=amount;
    }
    public void deposit(int amount){
        if(amount<0){
            logger.error("Incorrect amount {}, can't deposit less than zero",amount);
        }else{
            balance+=amount;
            logger.info("amount {} deposited to your account successfully. Current balance {}",amount,balance);
        }
    }

    public void withdraw(int amount){
        if(amount>balance){
            logger.error("Insufficient balance: requested amount {}. Current balance {}",amount,balance);
        }
        else{
            balance-=amount;
            logger.info("Rupees {} debited from your account. Current balance {}",amount,balance);
        }lowBalance();
    }

    public void lowBalance(){
        if(balance<100){
            logger.warn("Low blance: {}",balance);
        }
    }
}
