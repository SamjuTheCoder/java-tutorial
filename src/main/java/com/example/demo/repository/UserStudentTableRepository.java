package com.example.demo.repository;

import com.example.demo.model.UserStudentTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStudentTableRepository extends JpaRepository<UserStudentTable, Long> {

}
