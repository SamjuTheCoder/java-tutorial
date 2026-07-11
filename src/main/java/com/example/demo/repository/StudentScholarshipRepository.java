package com.example.demo.repository;

import com.example.demo.model.StudentScholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentScholarshipRepository extends JpaRepository<StudentScholarship, Long> {

}
