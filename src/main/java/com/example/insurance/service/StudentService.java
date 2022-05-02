package com.example.insurance.service;


import com.example.insurance.dto.StudentDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public interface StudentService{
    String registerStudent(StudentDetailsResponse studentDetailsResponse);

}
