package com.example.insurance.service;

import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.dto.UserDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
//    String fetchProductDetails(String productName);//get
//    String registerPatient(PatientDetailsRequest patientDetailsRequest);//post
//
//    PatientDetailsRequest fetchPatientDetailsBasedOnName(String patientName);

    String fetchProductDetails(String productName);

    String registerPatient(PatientDetailsRequest patientDetailsRequest);

    PatientDetailsRequest fetchPatientDetailsBasedOnName(String patientName);

    String registerUsers(UserDetailsResponse userDetailsResponse);//post
}
