package com.example.demo.request;

import com.example.demo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserUpdateRequest {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Gender gender;
    private String maritalStatus;
}
