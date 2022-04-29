package com.example.insurance.service;

import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.dto.PatientDetailsRequest1;
import org.springframework.stereotype.Component;

@Component
public interface TestService1 {
    PatientDetailsRequest1 getPatientDetails(int patientId);
}
