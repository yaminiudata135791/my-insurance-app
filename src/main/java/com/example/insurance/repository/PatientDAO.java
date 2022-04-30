package com.example.insurance.repository;

import com.example.insurance.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PatientDAO extends JpaRepository<Patient,Integer> {

     @Query(value="SELECT * From patient WHERE name=?1",nativeQuery=true)
     Patient findByName(String patientName);


}
