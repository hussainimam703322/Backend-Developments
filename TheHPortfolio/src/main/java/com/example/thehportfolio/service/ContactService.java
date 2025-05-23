package com.example.thehportfolio.service;


import com.example.thehportfolio.model.ContactSubmission;
import com.example.thehportfolio.repository.ContactSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactSubmissionRepository contactSubmissionRepository;

    @Autowired
    private EmailService emailService;

    public ContactSubmission submitContactForm(ContactSubmission submission) {
        ContactSubmission savedSubmission = contactSubmissionRepository.save(submission);
        // Send email notification after saving to DB
        emailService.sendContactNotificationEmail(savedSubmission);
        return savedSubmission;
    }

    // You could add methods to retrieve contact submissions if needed for an admin panel
}