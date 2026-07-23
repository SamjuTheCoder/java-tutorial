package com.example.demo.controllers;

import com.example.demo.model.ScoresTable;
import com.example.demo.request.ScoresTableRequest;
import com.example.demo.services.ScoresTableService;
import com.example.demo.response.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class ScoresTableController {

    private final ScoresTableService scoresTableService;
    public ScoresTableController(ScoresTableService scoresTableService) {
        this.scoresTableService = scoresTableService;
    }

    @PostMapping("/create-scores-table")
    public ApiResponse createScoresTable(@RequestBody ScoresTableRequest scoresTableRequest) {

        ScoresTable scoresTableCreated = scoresTableService.saveScoresTable(scoresTableRequest);

        return new ApiResponse(
                "scores table successfully created",
                "00",
                scoresTableCreated

        );
    }
}
