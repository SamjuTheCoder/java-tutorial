package com.example.demo.services;

import com.example.demo.model.UserPractice;
import com.example.demo.repository.UserRepositoryPractice;
import com.example.demo.request.UserRequestPractice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicePractice {

    //user repository interface
    private final UserRepositoryPractice userRepositoryPractice;

    //constructor injection
    public UserServicePractice(UserRepositoryPractice userRepositoryPractice) {
        this.userRepositoryPractice = userRepositoryPractice;
    }

    //save record to db
    public UserPractice saveUserPractice(UserRequestPractice userRequestPractice) {

        UserPractice userPractice = new UserPractice();
        userPractice.setFirstName(userRequestPractice.getFirstname());
        userPractice.setLastName(userRequestPractice.getLastname());
        userPractice.setGender(userRequestPractice.getGender());
        userPractice.setMaritalStatus(userRequestPractice.getMaritalStatus());
        userPractice.setDateOfBirth(userRequestPractice.getDateOfBirth());
        userPractice.setEmail(userRequestPractice.getEmail());
        userPractice.setPhoneNumber(userRequestPractice.getPhoneNumber());
        userPractice.setAddress(userRequestPractice.getAddress());
        userRepositoryPractice.save(userPractice);
        return userPractice;
    }

    //list all records
    public List<UserPractice> findAll() {
        return userRepositoryPractice.findAll();
    }
}
