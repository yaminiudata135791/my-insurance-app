package com.example.insurance.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class Loans {
    @Id
    private int id;

    private String loanNumber;
    private double loanAmount;
    private int loanInterest;
    private String loanType;
    private String status;
}
