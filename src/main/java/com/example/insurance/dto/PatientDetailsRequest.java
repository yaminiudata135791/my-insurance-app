package com.example.insurance.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PatientDetailsRequest {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String disease;

}


