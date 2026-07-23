package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.projections.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("""
    SELECT new com.example.demo.projections.UserProjection(
        u.name,
        u.email,
        u.phone
    )
    FROM User u
""")
    public List<UserProjection> findAllBy();
}
