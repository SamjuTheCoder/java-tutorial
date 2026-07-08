package com.example.demo.controllers;

import com.example.demo.enums.Gender;
import com.example.demo.model.UserPractice;
import com.example.demo.request.UserRequestPractice;
import com.example.demo.response.ApiResponsePractice;
import com.example.demo.services.UserServicePractice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserControllerPractice {

    private UserServicePractice userServicePractice;
    public UserControllerPractice(UserServicePractice userServicePractice) {
    this.userServicePractice = userServicePractice;
    }

@PostMapping("/create_user")
    public ApiResponsePractice createUserPractice (@RequestBody UserRequestPractice userRequestPractice) {
        UserPractice userPracticeCreated = userServicePractice.saveUserPractice(userRequestPractice);

        return new ApiResponsePractice(
                "Successfully Created",
                "00",
                userPracticeCreated
                );
}


@GetMapping("/list-users")
    public ApiResponsePractice listUserPractice() {

        List<UserPractice> userPractice = userServicePractice.findAll();

        return new ApiResponsePractice(
                "Successfully listed",
                "00",
                userPractice
                );

    }

}