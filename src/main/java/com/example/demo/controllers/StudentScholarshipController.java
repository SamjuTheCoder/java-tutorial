package com.example.demo.controllers;

import com.example.demo.model.StudentScholarship;
import com.example.demo.request.StudentScholarshipRequest;
import com.example.demo.response.ApiResponse;
import com.example.demo.services.StudentScholarshipService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentScholarshipController {

  private final StudentScholarshipService studentScholarshipService;
  public StudentScholarshipController(StudentScholarshipService studentScholarshipService) {
      this.studentScholarshipService = studentScholarshipService;
  }

  @PostMapping("/create_user")
    public ApiResponse createStudentScholarship (@RequestBody StudentScholarshipRequest studentScholarshipRequest) {
      StudentScholarship studentScholarshipCreated = studentScholarshipService.saveStudentScholarship(studentScholarshipRequest);

      return new ApiResponse(
              "student Scholarship Successfully Created",
              "00",
              studentScholarshipCreated

      );

  }

  @GetMapping("/list_users")
    public ApiResponse listStudentScholarships(){

    List<StudentScholarship> studentScholarship = studentScholarshipService.findAllStudentScholarship();

    return new ApiResponse(
              "Student Scholarship Successfully Listed",
              "00",
              studentScholarship
      );
  }

}
