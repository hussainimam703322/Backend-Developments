package com.example.thehportfolio.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "contact_submissions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Please enter a valid email address")
    @Column(nullable = false)
    private String email;

    @NotBlank(message = "Subject cannot be blank")
    @Column(nullable = false)
    private String subject;

    @NotBlank(message = "Message cannot be blank")
    @Size(min = 10, message = "Message must be at least 10 characters long")
    @Column(nullable = false, columnDefinition = "TEXT")
    private String message;

    @Column(name = "submitted_at", nullable = false)
    private LocalDateTime submittedAt = LocalDateTime.now();
}
