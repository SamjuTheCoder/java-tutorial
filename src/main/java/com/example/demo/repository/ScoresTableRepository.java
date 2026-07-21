package com.example.demo.repository;

import com.example.demo.model.ScoresTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoresTableRepository extends JpaRepository<ScoresTable, Long> {

}
