package com.example.demo.services;

import com.example.demo.model.ScoresTable;
import com.example.demo.request.ScoresTableRequest;
import com.example.demo.repository.ScoresTableRepository;
import org.springframework.stereotype.Service;

@Service
public class ScoresTableService {

    //scores table repository interface
    private final ScoresTableRepository scoresTableRepository;

    //constructor injection
    public ScoresTableService(ScoresTableRepository scoresTableRepository) {
        this.scoresTableRepository = scoresTableRepository;
    }

    //save record to db
    public ScoresTable saveScoresTable(ScoresTableRequest scoresTableRequest) {

        ScoresTable scoresTable = new ScoresTable();
        scoresTable.setSubject(scoresTableRequest.getSubject());
        scoresTable.setScore(scoresTableRequest.getScore());
        scoresTable.setGrade(scoresTableRequest.getGrade());
        scoresTableRepository.save(scoresTable);
        return scoresTable;

    }
}
