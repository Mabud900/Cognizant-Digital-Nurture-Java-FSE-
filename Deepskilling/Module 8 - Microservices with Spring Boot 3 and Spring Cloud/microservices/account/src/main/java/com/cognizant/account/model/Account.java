package com.cognizant.account.model;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Account {
    private String number;
    private String type;
    private long balance;

    public Account() {}

    public Account(String number, String type, long balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }
}