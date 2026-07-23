package com.example.demo.controllers;

import com.example.demo.model.SubjectsTable;
import com.example.demo.request.SubjectsTableRequest;
import com.example.demo.services.SubjectsTableService;
import com.example.demo.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SubjectsTableController {

    private final SubjectsTableService subjectsTableService;
    public SubjectsTableController(SubjectsTableService subjectsTableService) {
        this.subjectsTableService = subjectsTableService;
    }

    @PostMapping("/create-subjects-table")
    public ApiResponse createSubjectsTable(@RequestBody SubjectsTableRequest subjectsTableRequest) {

        SubjectsTable subjectTableCreated = subjectsTableService.saveSubjectsTable(subjectsTableRequest);

        return new ApiResponse(
                "subjects table successfully created",
                "00",
                subjectTableCreated
        );
    }

    }
