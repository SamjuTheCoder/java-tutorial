package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "tbl_users_practice")
public class UserPractice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true, nullable = false, length = 80)
    private String userName;

    @Column(unique = false, nullable = false, length = 25)
    private String firstName;

    @Column(unique = false, nullable = false, length = 25)
    private String lastName;

    @Column(unique = false, nullable = false, length = 8)
    private String gender;

    @Column(unique = false, nullable = false, length = 15)
    private String dateOfBirth;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(unique = false, nullable = false, length = 50)
    private String password;

    @Column(unique = false, nullable = false, length = 50)
    private String confirmPassword;

    @Column(unique = true, nullable = false, length = 20)
    private String phoneNumber;

    @Column(unique = false, nullable = false, length = 100)
    private String firstAddress;

    @Column(unique = false, nullable = true, length = 100)
    private String secondAddress;

    @Column(unique = false, nullable = false, length = 100)
    private String city;

    @Column(unique = false, nullable = false, length = 100)
    private String state;

    @Column(unique = false, nullable = false, length = 60)
    private String country;

    @Column(unique = false, nullable = true, length = 15)
    private String postalCode;

}
