package com.example.insurance.repository;

import com.example.insurance.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface PatientDAO1 extends JpaRepository<Patient,Integer> {

}
