package com.example.insurance.serviceimpl;

import com.example.insurance.dto.StudentDetailsResponse;
import com.example.insurance.entity.Student;
import com.example.insurance.repository.StudentDAO;
import com.example.insurance.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


    @Service
    public class StudentServiceImpl implements StudentService {

        @Autowired
        private StudentDAO studentDAO;

        @Override
        public String registerStudent(StudentDetailsResponse studentDetailsResponse) {
            Student student=new Student();

            student.setId(studentDetailsResponse.getId());
            student.setStudentName(studentDetailsResponse.getStudentName());
            student.setBranch(studentDetailsResponse.getBranch());
            student.setAddress(studentDetailsResponse.getAddress());

            studentDAO.save(student);
            return "student details save successfully";
        }
    }



