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
@Table(name = "tbl_scores_table")
public class ScoresTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false, length = 50)
    private String subject;
    @Column(nullable = false, unique = false, length = 50)
    private String score;
    @Column(nullable = false, unique = false, length = 50)
    private String grade;

    //Joining the ScoresTable to the StudentTable M:1 mapping
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private StudentTable studentTable;

//joining the ScoresTable to the SubjectsTable M:1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjects_id")
    private SubjectsTable subjectsTable;
}
