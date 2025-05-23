package com.example.thehportfolio.repository;


// Ensure this package matches your project structure

import com.example.thehportfolio.model.BlogPost; // Ensure this matches your BlogPost model package
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    // Spring Data JPA automatically provides CRUD methods (saveAll, findAll, etc.)
}