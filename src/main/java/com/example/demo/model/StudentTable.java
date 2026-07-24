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

    //Joining the StudentTable to the UserStudentTable  1:1 mapping
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserStudentTable userStudentTable;

    //mapping the StudentTable to the ScoresTable 1:M mapping
    @OneToMany(mappedBy = "studentTable")
    private List<ScoresTable> scoresTable;

    //mapping the StudentTable to the SubjectTable 1:M mapping
    @OneToMany(mappedBy = "studentTable")
    private List<SubjectsTable> subjectsTable;
}
