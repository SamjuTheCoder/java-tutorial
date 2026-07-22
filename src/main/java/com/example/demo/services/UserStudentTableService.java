package com.example.demo.services;

import com.example.demo.model.UserStudentTable;
import com.example.demo.request.UserStudentTableRequest;
import com.example.demo.repository.UserStudentTableRepository;
import org.springframework.stereotype.Service;

@Service
public class UserStudentTableService {

    //user student table repository interface
    private final UserStudentTableRepository userStudentTableRepository;

    //constructor injection
    public UserStudentTableService(UserStudentTableRepository userStudentTableRepository) {
        this.userStudentTableRepository = userStudentTableRepository;
    }

    //save record to db
    public UserStudentTable saveUserStudentTable(UserStudentTableRequest userStudentTableRequest) {

        UserStudentTable userStudentTable = new UserStudentTable();
        userStudentTable.setUserName(userStudentTableRequest.getUserName());
        userStudentTable.setPassword(userStudentTableRequest.getPassword());
        userStudentTable.setRole(userStudentTableRequest.getRole());
        userStudentTableRepository.save(userStudentTable);
        return userStudentTable;

    }

}
