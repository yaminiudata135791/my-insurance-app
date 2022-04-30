package com.example.insurance.serviceimpl;

import com.example.insurance.dto.UserDetailsResponse;
import com.example.insurance.entity.Users;
import com.example.insurance.repository.UserDAO;
import com.example.insurance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public String registerUsers(UserDetailsResponse userDetailsResponse) {


        Users users = new Users();
        users.setId(userDetailsResponse.getId());
        users.setFirstName(userDetailsResponse.getFirstName());
        users.setLastName(userDetailsResponse.getLastName());
        users.setEmailId(userDetailsResponse.getEmailId());
        users.setMobileNumber(userDetailsResponse.getMobileNumber());

        userDAO.save(users);
        return "User details are saved";


    }
}