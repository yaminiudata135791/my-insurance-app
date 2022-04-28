package com.example.insurance.service;

import com.example.insurance.dto.PatientDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String fetchProductDetails(String productName);//get
    String registerPatient(PatientDetailsRequest patientDetailsRequest);//post


}
