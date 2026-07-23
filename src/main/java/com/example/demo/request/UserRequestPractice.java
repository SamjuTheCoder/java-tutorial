package com.example.demo.request;

import com.example.demo.enums.Gender;
import com.example.demo.enums.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestPractice {

    private String firstname;
    private String lastname;
    private Gender gender;
    private String maritalStatus;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;
    private String Address;

}
