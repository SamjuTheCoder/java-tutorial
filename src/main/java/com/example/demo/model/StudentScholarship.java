package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.w3c.dom.Text;
import java.sql.Timestamp;
import java.util.Date;
import org.hibernate.engine.jdbc.Size;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tbl_student_scholarship")
public class StudentScholarship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = false, nullable = false, length = 20)
    private String firstName;
    @Column(unique = false, nullable = false, length = 20)
    private String lastName;
    @Column(unique = false, nullable = false, length = 8)
    private String gender;
    @Column(unique = false, nullable = false, length = 12)
    private Date dateOfBirth;
    @Column(unique = true, nullable = false, length = 100)
    private String email;
    @Column(unique = true, nullable = false, length = 20)
    private String phoneNumber;
    @Column(unique = false, nullable = false, length = 60)
    private String nationality;
    @Column(unique = false, nullable = false, length = 23)
    private String state;
    @Column(unique = false, nullable = false, length = 100)
    private String address;
    @Column(unique = false, nullable = false, length = 100)
    private String schoolName;
    @Column(unique = false, nullable = false, length = 80)
    private String department;
    @Column(unique = false, nullable = false, length = 50)
    private String course;
    @Column(unique = true, nullable = false, length = 60)
    private String studentId;
    @Column(unique = false, nullable = false, length = 5)
    private Double cGPA;
    @Column(unique = false, nullable = false, length = 50)
    private String scholarshipType;
    @Column(unique = false, nullable = false, length = 150)
    private Text reason;
    @Column(unique = false, nullable = false, length = 20)
    private String Passport;
    @Column(unique = false, nullable = false, length = 200)
    private String admissionLetter;
    @Column(unique = false, nullable = false, length = 20)
    private String schoolIdCard;
    @Column(unique = false, nullable = false, length = 50)
    private String status;
    @Column(unique = false, nullable = false, length = 15)
    private Timestamp createdDate;

}
