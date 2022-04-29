package com.example.insurance.serviceimpl;

import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.entity.Patient;
import com.example.insurance.repository.PatientDAO;
import com.example.insurance.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private PatientDAO patientDAO;

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
        Patient patient = new Patient();
        patient.setName(patientDetailsRequest.getName());
        patient.setAge(patientDetailsRequest.getAge());
        patient.setDisease(patientDetailsRequest.getDisease());

        patientDAO.save(patient);
        return "Patient Details saved successfully";
    }

}
