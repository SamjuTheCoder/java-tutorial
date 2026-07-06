package com.example.demo.request;

import com.example.demo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserRequest {
    private String name;
    private String email;
    private String phone;
    private Gender gender;
    private String maritalStatus;
}
