package com.cognizant.loan.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Loan {
    private String number;
    private String type;
    private long loan;
    private long emi;
    private int tenure;

    public Loan() {}

    public Loan(String number, String type, long loan, long emi, int tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }
}