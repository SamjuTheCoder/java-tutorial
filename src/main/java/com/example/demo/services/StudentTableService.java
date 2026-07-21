package com.example.demo.services;

import com.example.demo.model.StudentTable;
import com.example.demo.request.StudentTableRequest;
import com.example.demo.repository.StudentTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentTableService {

    //student table repository interface
    private final StudentTableRepository studentTableRepository;

    //constructor injection
    public StudentTableService(StudentTableRepository studentTableRepository) {
        this.studentTableRepository = studentTableRepository;
    }

    //save record to db
    public StudentTable saveStudentTable(StudentTableRequest studentTableRequest) {

        StudentTable studentTable = new StudentTable();
        studentTable.setFirstName(studentTableRequest.getFirstName());
        studentTable.setLastName(studentTableRequest.getLastName());
        studentTable.setSex(studentTableRequest.getSex());
        studentTable.setDepartment(studentTableRequest.getDepartment());
        studentTableRepository.save(studentTable);
        return studentTable;

          }

    }

