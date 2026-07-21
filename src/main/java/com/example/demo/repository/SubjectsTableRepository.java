package com.example.demo.repository;

import com.example.demo.model.SubjectsTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsTableRepository extends JpaRepository<SubjectsTable, Long> {
   }
