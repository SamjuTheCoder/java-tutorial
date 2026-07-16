package com.example.demo.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class StudentScholarshipUpdateRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;
    private String nationality;
    private String state;
    private String address;
    private String schoolName;
    private String department;
    private String course;
    private String studentId;
    private String cGPA;
    private String scholarshipType;
    private String reason;
    private String passport;
    private String admissionLetter;
    private String schoolIdCard;
    private String status;
    private String createdDate;
}
