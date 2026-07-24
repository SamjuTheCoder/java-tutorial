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
@Table(name = "tbl_subjects_table")
public class SubjectsTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false, length = 50)
    private String subjects;

    //Joining the SubjectsTable to the StudentTable  M:1 mapping
    @ManyToOne
    @JoinColumn(name = "student_id")
    private List<StudentTable> studentTable;

    //Mapping the SubjectsTable to the ScoresTable
    @OneToMany(mappedBy = "subjectsTable")
    private List<ScoresTable> scoresTable;
}
