package com.example.insurance.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class StudentDetailsResponse {

        private int id;
        private String studentName;
        private String branch;
        private String address;

}
