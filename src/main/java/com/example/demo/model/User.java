package com.example.demo.model;

import com.example.demo.enums.Gender;
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
@Table(name = "tbl_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45, nullable = false, unique = false)
    private String name;
    @Column(length = 100, nullable = false, unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private Gender gender;
    @Column(length = 14, nullable = false, unique = true)
    private String phone;
    private String maritalStatus;
}
