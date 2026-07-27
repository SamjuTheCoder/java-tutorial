package com.example.demo.repository;

import com.example.demo.model.Akani;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AkaniRepository extends JpaRepository<Akani, Long> {
}
