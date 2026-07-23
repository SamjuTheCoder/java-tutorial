package com.example.demo.controllers;

import com.example.demo.model.UserStudentTable;
import com.example.demo.request.UserStudentTableRequest;
import com.example.demo.services.UserStudentTableService;
import com.example.demo.response.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class UserStudentTableController {
    private final UserStudentTableService userStudentTableService;
    public UserStudentTableController(UserStudentTableService userStudentTableService) {
        this.userStudentTableService = userStudentTableService;
    }

    @PostMapping("/create-user-student-table")
    public ApiResponse createUserStudentTable(@RequestBody UserStudentTableRequest userStudentTableRequest) {

        UserStudentTable userStudentTableCreated = userStudentTableService.saveUserStudentTable(userStudentTableRequest);

        return new ApiResponse(
                "user student table successfully created",
                "00",
                userStudentTableCreated
        );
    }

}
