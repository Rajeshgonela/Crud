package com.project.ResumeProject.repository;

import com.project.ResumeProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<Object> findByEmail(String email);
}
