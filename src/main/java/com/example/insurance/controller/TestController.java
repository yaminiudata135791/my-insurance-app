package com.example.insurance.controller;


import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("fetch-product-details/{productName}")
    public String myFirstMethod(@PathVariable String productName){
        String result= testService.fetchProductDetails(productName);
        return result;
    }

    @PostMapping("register-patient")
    public String registerNewPatient(@RequestBody PatientDetailsRequest patientDetailsRequest){
        return testService.registerPatient(patientDetailsRequest);
    }
}






