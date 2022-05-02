package com.example.insurance.service;

import com.example.insurance.dto.BaseResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


    @Component
    public interface UserService{


//      UserDetailsResponse registerUsers(int userDetailsResponse);

//        String registerUsers(UserDetailsResponse userDetailsResponse);

        ResponseEntity<BaseResponse> findUserDetails(int userId);

    }
