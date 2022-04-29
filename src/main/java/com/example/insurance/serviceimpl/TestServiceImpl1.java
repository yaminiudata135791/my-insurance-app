package com.example.insurance.serviceimpl;

import com.example.insurance.dto.PatientDetailsRequest1;
import com.example.insurance.entity.Patient;
import com.example.insurance.repository.PatientDAO;
import com.example.insurance.repository.PatientDAO1;
import com.example.insurance.service.TestService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl1 implements TestService1 {

        @Autowired
        private PatientDAO1 patientDAO1;
        @Override
        public PatientDetailsRequest1 getPatientDetails(int patientId) {

            Optional<Patient> patient = patientDAO1.findById(patientId);
            Patient patientDetailsRequest1= patient.get();


            PatientDetailsRequest1 patientDetails = new PatientDetailsRequest1();

            patientDetails.setId(patientDetailsRequest1.getId());
            patientDetails.setName(patientDetailsRequest1.getName());
            patientDetails.setAge(patientDetailsRequest1.getAge());
            patientDetails.setDisease(patientDetailsRequest1.getDisease());

            return patientDetails;

        }
    }

