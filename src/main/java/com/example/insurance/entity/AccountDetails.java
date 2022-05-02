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
public class AccountDetails {

    @Id
    private int accountId;

    private String accountantName;

}
