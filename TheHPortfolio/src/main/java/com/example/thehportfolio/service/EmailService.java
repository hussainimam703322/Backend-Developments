package com.example.thehportfolio.service;

import com.example.thehportfolio.model.ContactSubmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public boolean sendContactNotificationEmail(ContactSubmission submission) {
        try {
            // Create a new SimpleMailMessage
            SimpleMailMessage message = new SimpleMailMessage();

            // Set the from and to email addresses
            message.setFrom("TheHPortfolio <hussainengineer2025@gmail.com>"); // Sender's email
            message.setTo("hussainimam78621@gmail.com"); // Recipient's email (you can change this to your desired recipient)

            // Set the subject of the email
            message.setSubject("New Contact Form Submission: " + submission.getSubject());

            // Create the body of the email using information from the submission
            message.setText(
                    "Name: " + submission.getName() + "\n" +
                            "Email: " + submission.getEmail() + "\n" +
                            "Subject: " + submission.getSubject() + "\n" +
                            "Message:\n" + submission.getMessage()
            );

            // Send the email
            mailSender.send(message);

            // Return true if email sent successfully
            return true;
        } catch (MailException e) {
            // Log the error in case of failure
            System.err.println("Error sending contact email: " + e.getMessage());
            e.printStackTrace();

            // Return false in case of failure
            return false;
        }
    }
}
