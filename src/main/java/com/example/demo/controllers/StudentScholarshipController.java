package com.example.demo.controllers;

import com.example.demo.model.StudentScholarship;
import com.example.demo.request.StudentScholarshipRequest;
import com.example.demo.request.StudentScholarshipUpdateRequest;
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

  @PostMapping("/create-student-scholarship-users")
    public ApiResponse createStudentScholarship (@RequestBody StudentScholarshipRequest studentScholarshipRequest) {

    StudentScholarship studentScholarshipCreated = studentScholarshipService.saveStudentScholarship(studentScholarshipRequest);

      return new ApiResponse(
              "student Scholarship Successfully Created",
              "00",
              studentScholarshipCreated

      );

  }

  @GetMapping("/list-student-scholarship-users")
    public ApiResponse listStudentScholarships(){

    List<StudentScholarship> studentScholarship = studentScholarshipService.findAll();

    return new ApiResponse(
              "Student Scholarship Successfully Listed",
              "00",
              studentScholarship
      );
  }

  //delete user
  @DeleteMapping("/delete-student-scholarship-application/{id}")
  public ApiResponse deleteStudentScholarshipById(@PathVariable Long id){

      StudentScholarship studentScholarship = studentScholarshipService.findStudentScholarshipById(id);

      if (studentScholarship == null){
          return new ApiResponse(
                  "Record not found",
                  "E01",
                  false
          );
      }


    studentScholarshipService.deleteStudentScholarshipById(id);

    return new ApiResponse(
            "successfully deleted",
            "00",
            true
    );
  }

//find record by id
@GetMapping("/find-student-scholarship-application-by-id/{id}")
  public ApiResponse findStudentScholarshipById(@PathVariable Long id){

    StudentScholarship studentScholarship = studentScholarshipService.findStudentScholarshipById(id);

    if (studentScholarship == null){
      return new ApiResponse(
              "student scholarship record not found",
              "E01",
              false
      );
    }

    return new ApiResponse(
            "student scholarship record found",
            "00",
            studentScholarship

    );
}

//update user record
  @PutMapping("/update-student-scholarship-application")
  public ApiResponse updateStudentScholarship(@RequestBody StudentScholarshipUpdateRequest studentScholarshipUpdateRequest){
    studentScholarshipService.updateStudentScholarship(studentScholarshipUpdateRequest);

    return new ApiResponse(
            "Student Scholarship successfully updated",
            "00",
            true
    );

  }

}
