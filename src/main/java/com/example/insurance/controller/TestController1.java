package com.example.insurance.controller;

import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.dto.PatientDetailsRequest1;
import com.example.insurance.service.TestService;
import com.example.insurance.service.TestService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {

    @Autowired
    private TestService1 testService1;

    @PostMapping("get-patient-details/{patientId}")
    public PatientDetailsRequest1 fetchPatientDetails(@PathVariable int patientId){
        return testService1.getPatientDetails(patientId);
    }
}
