package com.example.insurance.service;

import com.example.insurance.dto.PatientDetailsRequest1;
import com.example.insurance.dto.UserDetailsResponse;
import org.springframework.stereotype.Component;


    @Component
    public interface UserService{
//      UserDetailsResponse registerUsers(int userDetailsResponse);

        String registerUsers(UserDetailsResponse userDetailsResponse);
    }
