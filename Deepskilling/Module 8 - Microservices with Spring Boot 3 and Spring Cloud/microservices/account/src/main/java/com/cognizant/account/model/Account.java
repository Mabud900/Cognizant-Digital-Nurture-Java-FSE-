package com.cognizant.account.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
public class Account {
    private String number;
    private String type;
    private int balance;

   public Account(String number, String type, int balance){
        this.number=number;
        this.type=type;
        this.balance=balance;
    }
}
