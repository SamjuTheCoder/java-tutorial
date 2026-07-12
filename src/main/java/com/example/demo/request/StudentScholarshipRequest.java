package com.example.demo.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.Text;
import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentScholarshipRequest {

    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;
    private String nationality;
    private String state;
    private String address;
    private String schoolName;
    private String department;
    private String course;
    private String studentId;
    private Double cGPA;
    private String scholarshipType;
    private Text reason;
    private String passport;
    private String admissionLetter;
    private String schoolIdCard;
    private String status;
    private Timestamp createdDate;

}
