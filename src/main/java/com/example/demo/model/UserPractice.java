package com.example.demo.model;

import com.example.demo.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.jdbc.Size;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tbl_users_practice")
public class UserPractice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = false, nullable = false, length = 25)
    private String firstName;
    @Column(unique = false, nullable = false, length = 25)
    private String lastName;
    @Column(unique = false, nullable = false, length = 8)
    private Gender gender;
    @Column(unique = false, nullable = false, length = 8)
    private String maritalStatus;
    @Column(unique = false, nullable = false, length = 15)
    private String dateOfBirth;
    @Column(unique = true, nullable = false, length = 100)
    private String email;
    @Column(unique = true, nullable = false, length = 20)
    private String phoneNumber;
    @Column(unique = false, nullable = false, length = 100)
    private String Address;

}
