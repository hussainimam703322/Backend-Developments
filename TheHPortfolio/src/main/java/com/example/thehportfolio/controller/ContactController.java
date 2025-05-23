package com.example.thehportfolio.controller;


import com.example.thehportfolio.model.ContactSubmission;
import com.example.thehportfolio.service.ContactService;
import jakarta.validation.Valid; // For @Valid annotation
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ResponseEntity<ContactSubmission> submitContactForm(@Valid @RequestBody ContactSubmission submission) {
        ContactSubmission savedSubmission = contactService.submitContactForm(submission);
        return new ResponseEntity<>(savedSubmission, HttpStatus.CREATED);
    }
}
