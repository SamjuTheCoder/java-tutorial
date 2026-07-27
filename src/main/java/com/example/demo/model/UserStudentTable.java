package com.example.demo.model;

import com.example.demo.enums.Roles;
import com.example.demo.request.UserStudentTableRequest;
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
@Table(name = "tbl_user_student_table")
public class UserStudentTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false, length = 50)
    private String userName;
    @Column(nullable = false, length = 50)
    private String password;
    @Column(nullable = false, length = 100)
    private Roles roles; //Roles is an Enum

//mapping the UserStudentTable to the StudentTable 1:1 mapping
    @OneToOne(mappedBy = "userStudentTable")
    private StudentTable studentTable;

}
