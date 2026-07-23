package com.example.demo.controllers;

import com.example.demo.enums.Gender;
import com.example.demo.model.User;
import com.example.demo.projections.UserProjection;
import com.example.demo.request.UserRequest;
import com.example.demo.request.UserUpdateRequest;
import com.example.demo.response.ApiResponse;
import com.example.demo.services.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserServices userServices;

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

        List<User> user = userServices.findAllUsers();

        return new ApiResponse(
                "Successfully listed!",
                "00",
                user
        );
    }

    // delete user
    @DeleteMapping("/delete-user/{id}")
    public ApiResponse deleteUserById(@PathVariable  Long id){

        userServices.deleteUserById(id);

        return new ApiResponse(
                "Successfully deleted!",
                "00",
                ""
        );
    }

    // find record by id
    @GetMapping("/find-user-byid/{id}")
    public ApiResponse findUserById(@PathVariable  Long id){

        User user = userServices.getUserById(id);

        if(user == null){
            return new ApiResponse(
                    "RECORD NOT FOUND!",
                    "E01",
                    ""
            );
        }

        return new ApiResponse(
                "SUCCESSFULLY FIND USER BY ID",
                "00",
                user
        );
    }

    // update user record
    @PutMapping("/update-user")
    public ApiResponse updateUser(@RequestBody UserUpdateRequest userUpdateRequest){
        userServices.updateUser(userUpdateRequest);

        return new ApiResponse(
                "Successfully updated!",
                "00",
                ""
        );
    }

    @GetMapping("/list-users-projection")
    public ApiResponse listUserProjection() {

        List<UserProjection> userProjections = userServices.findUserProjections();

        return new ApiResponse(
                "Successfully listed user projections!",
                "00",
                userProjections
        );
    }
}
