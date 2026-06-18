package com.example.demo.services;

import com.example.demo.request.UserRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

    private final List<UserRequest> userRequests = new ArrayList<>();

    public List<UserRequest> createUser(UserRequest userRequest) {
        userRequests.add(userRequest);

        return userRequests;
    }

}
