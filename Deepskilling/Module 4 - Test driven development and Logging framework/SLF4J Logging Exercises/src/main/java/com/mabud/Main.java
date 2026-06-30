package com.mabud;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount ba =new BankAccount(2000);
        ba.deposit(500);
        ba.withdraw(3000);
        ba.deposit(2000);
    }
}