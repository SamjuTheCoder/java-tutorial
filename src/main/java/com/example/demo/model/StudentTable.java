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
@Table(name = "tbl_student_table")
public class StudentTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false, length = 50)
    private String firstName;
    @Column(nullable = false, unique = false, length = 50)
    private String lastName;
    @Column(nullable = false, unique = false, length = 50)
    private String sex;
    @Column(nullable = false, unique = false, length = 50)
    private String department;
}
