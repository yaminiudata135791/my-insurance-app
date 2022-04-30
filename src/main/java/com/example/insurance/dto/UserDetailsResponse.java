package com.example.insurance.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserDetailsResponse {

    private int id;
    private String accountNumber;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailId;
}
