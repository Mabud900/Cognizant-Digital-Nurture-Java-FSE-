package com.cognizant.loan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    private String number;
    private String type;
    private int loan;
    private int emi;
    private int tenure;
}