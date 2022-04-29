package com.example.insurance.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class PatientDetailsRequest1 {

    private int Id;
    private String name;
    private int age;
    private String disease;

}
