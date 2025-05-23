package com.example.thehportfolio.repository;


import com.example.thehportfolio.model.ContactSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactSubmissionRepository extends JpaRepository<ContactSubmission, Long> {
}