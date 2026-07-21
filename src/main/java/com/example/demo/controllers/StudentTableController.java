package com.example.demo.controllers;

import com.example.demo.model.StudentTable;
import com.example.demo.request.StudentTableRequest;
import com.example.demo.services.StudentTableService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.response.ApiResponse;

@RestController
@RequestMapping("/api/v1")
public class StudentTableController {

private final StudentTableService studentTableService;
public StudentTableController(StudentTableService studentTableService) {
		this.studentTableService = studentTableService;
}

@PostMapping("/create-student-table")
    public ApiResponse createStudentTable(@RequestBody StudentTableRequest studentTableRequest) {

    StudentTable studentTableCreated = studentTableService.saveStudentTable(studentTableRequest);

    return new ApiResponse(
            "student table succesfully created",
            "00",
            studentTableCreated
    );
}

}
