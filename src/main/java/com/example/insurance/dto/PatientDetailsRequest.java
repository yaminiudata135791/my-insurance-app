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

    private int id;
    private String name;
    private int age;
    private String disease;

}


