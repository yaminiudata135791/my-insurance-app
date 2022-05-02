package com.example.insurance.serviceimpl;

import com.example.insurance.dto.BaseResponse;
import com.example.insurance.dto.UserDetailsResponse;
import com.example.insurance.entity.Users;
import com.example.insurance.repository.UserDAO;
import com.example.insurance.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

//    @Autowired
//    private UserService userService;

//    @Override
//    public String registerUsers(UserDetailsResponse userDetailsResponse) {
//
//
//        Users users = new Users();
//        users.setId(userDetailsResponse.getId());
//        users.setFirstName(userDetailsResponse.getFirstName());
//        users.setLastName(userDetailsResponse.getLastName());
//        users.setEmailId(userDetailsResponse.getEmailId());
//        users.setMobileNumber(userDetailsResponse.getMobileNumber());
//
//        userDAO.save(users);
//        return "User details are saved";
//
//
//    }

    @Override
    public ResponseEntity<BaseResponse> findUserDetails(int userId) {

        BaseResponse baseResponse=new BaseResponse();
        UserDetailsResponse userDetailsResponse=new UserDetailsResponse();

        Optional<Users> users=userDAO.findById(userId);

        if(!users.isPresent()){


            baseResponse.setMessage("User ID cannot be 0 or null");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode((HttpStatus.NOT_FOUND.value()));
            baseResponse.setResponse(userDetailsResponse);

            return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.NOT_FOUND);
        }

        Users userData=users.get();


        userDetailsResponse.setId(userData.getId());
        userDetailsResponse.setFirstName(userData.getFirstName());
        userDetailsResponse.setLastName(userData.getLastName());
        userDetailsResponse.setAccountNumber(userData.getAccountNumber());
        userDetailsResponse.setMobileNumber(userData.getMobileNumber());
        userDetailsResponse.setEmailId(userData.getEmailId());

               return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.OK);
    }
}