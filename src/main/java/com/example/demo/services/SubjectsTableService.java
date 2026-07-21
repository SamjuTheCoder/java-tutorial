package com.example.demo.services;

import com.example.demo.model.SubjectsTable;
import com.example.demo.request.SubjectsTableRequest;
import com.example.demo.repository.SubjectsTableRepository;
import org.springframework.stereotype.Service;

@Service
public class SubjectsTableService {

    //subjects table repository interface
    private final SubjectsTableRepository subjectsTableRepository;

    //constructor injection
    public SubjectsTableService(SubjectsTableRepository subjectsTableRepository) {
        this.subjectsTableRepository = subjectsTableRepository;
    }

    //save record to db
    public SubjectsTable saveSubjectsTable(SubjectsTableRequest subjectsTableRequest) {

        SubjectsTable subjectsTable = new SubjectsTable();
        subjectsTable.setSubjects(subjectsTableRequest.getSubject());
        subjectsTableRepository.save(subjectsTable);
        return subjectsTable;

    }
}
