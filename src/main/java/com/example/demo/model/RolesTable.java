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
@Table(name = "roles_table")
public class RolesTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Enumerated is a JPA annotation that tells Spring Boot/Hibernate how to store an enum in the database.
    //The EnumType.STRING part means save the enum as its name (text), not as a number
   //com.example.demo.enums.Roles This is the data type of the variable. Instead of using a String, you're using the Roles enum.
    @Enumerated(EnumType.STRING)
    private com.example.demo.enums.Roles rolesName;

}
