package com.example.thehportfolio.repository;

import com.example.thehportfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByIsActiveTrue(); // Updated to match the 'isActive' field
}
