package com.example.demo.controllers;

import com.example.demo.enums.Gender;
import com.example.demo.request.UserRequest;
import com.example.demo.response.ApiResponse;
import com.example.demo.services.UserServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping("/create-user")
    public ApiResponse createUser(@RequestBody UserRequest userRequest) {
        List<UserRequest> userCreated = userServices.createUser(userRequest);

        return new ApiResponse(
                "Successfully created!",
                "00",
                userCreated
        );

    }
}
