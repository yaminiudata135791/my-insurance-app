package com.example.insurance.repository;



import com.example.insurance.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface StudentDAO  extends JpaRepository<Student, Integer> {

}
