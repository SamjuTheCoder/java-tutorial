package com.example.demo.repository;

import com.example.demo.model.StudentScholarship;
import com.example.demo.projections.StudentScholarshipProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentScholarshipRepository extends JpaRepository<StudentScholarship, Long> {


    //StudentScholarshipProjection Query
    //this section is added because we want to manually query/retrieve selected fields
    //instead of allowing Spring boot to automatically retrieve all the fields

    //""" """ The triple quotes is a Java text block for writing multi-line strings.
    //sc is short for StudentScholarship (alias/nickname)
    @Query("""
            SELECT new com.example.demo.projections.StudentScholarshipProjection(
                    sc.firstName,
                    sc.lastName,
                    sc.email,
                    sc.phoneNumber
            )
            FROM StudentScholarship sc
            """)
            public List<StudentScholarshipProjection> findAllStudentScholarshipProjection();

}
