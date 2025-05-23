package com.example.thehportfolio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "blog_posts")
@Data
@NoArgsConstructor  // Lombok will generate the no-argument constructor
@AllArgsConstructor // Lombok will generate the all-arguments constructor
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String summary;
    private String content;
    private String category;
    private LocalDateTime publishedDate;
}
