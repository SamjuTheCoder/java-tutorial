package com.example.demo.controllers;

import com.example.demo.enums.Gender;
import com.example.demo.model.User;
import com.example.demo.request.UserRequest;
import com.example.demo.response.ApiResponse;
import com.example.demo.services.UserServices;
import org.springframework.web.bind.annotation.*;

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
        User userCreated = userServices.saveUser(userRequest);

        return new ApiResponse(
                "Successfully created!",
                "00",
                userCreated
        );
    }

    @GetMapping("/list-users")
    public ApiResponse listUsers() {

        List<User> user = userServices.findAll();

        return new ApiResponse(
                "Successfully listed!",
                "00",
                user
        );
    }
}
