package com.example.insurance.serviceimpl;

import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String fetchProductDetails(String productName) {
        if(productName != null){
            switch(productName){

                case "A":
                    return "Laptop";
                case "B":
                    return "mobile";
                case "C":
                    return "Machine";
                default:
                    return "no product found";

            }
        }else {
            return "Product cannot be null";
        }

    }

    @Override
    public String registerPatient(PatientDetailsRequest patientDetailsRequest) {
        System.out.println(patientDetailsRequest);
        return null;
    }

}
