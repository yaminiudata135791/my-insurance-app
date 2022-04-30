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
public class Transaction {
    @Id
    private int id;

    private String transactionId;
    private String transactionType;
    private String status;
    private String transactionDate;
    private String amount;


}
