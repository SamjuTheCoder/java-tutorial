package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tbl_akani")
public class Akani {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false, length = 50)
    private String firstName;
    @Column(nullable = false, unique = false, length = 50)
    private String lastName;
    @Column(nullable = false, unique = false, length = 50)
    private String gender;
    @Column(nullable = false, unique = false, length = 50)
    private String dateOfBirth;
    @Column(nullable = false, unique = false, length = 50)
    private String email;
    @Column(nullable = false, unique = false, length = 50)
    private String phoneNumber;
    @Column(nullable = false, unique = false, length = 50)
    private String address;
}
