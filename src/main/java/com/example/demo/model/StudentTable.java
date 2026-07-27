package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserStudentTable userStudentTable;

    @OneToMany(mappedBy = "studentTable")
    private List<ScoresTable> scoresTable;

    @OneToMany(mappedBy = "studentTable")
    private List<SubjectsTable> subjectsTable;
}
