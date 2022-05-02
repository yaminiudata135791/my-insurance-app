package com.example.insurance.controller;

import com.example.insurance.dto.StudentDetailsResponse;
import com.example.insurance.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class StudentController {


        @Autowired
        private StudentService studentService;

        @PostMapping("fetch-student-details")
        public String displayStudentDetails(@RequestBody StudentDetailsResponse studentDetailsResponse) {
            return studentService.registerStudent(studentDetailsResponse);
        }
    }


