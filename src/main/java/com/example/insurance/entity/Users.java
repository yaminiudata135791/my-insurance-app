package com.example.insurance.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    private String firstName;
    private String lastName;
    private String accountNumber;
    private String mobileNumber;
    private String emailId;

    @OneToMany
    @JoinColumn(name="accountId",referencedColumnName = "id")
    private List<AccountDetails> accountDetails;



}
