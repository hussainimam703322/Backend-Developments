package com.example.thehportfolio.controller;


import com.example.thehportfolio.model.BlogPost;
import com.example.thehportfolio.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog-posts")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public ResponseEntity<List<BlogPost>> getAllBlogPosts() {
        List<BlogPost> blogPosts = blogPostService.getAllBlogPosts();
        return ResponseEntity.ok(blogPosts);
    }

    @PostMapping
    public ResponseEntity<BlogPost> createBlogPost(@RequestBody BlogPost blogPost) {
        BlogPost createdBlogPost = blogPostService.saveBlogPost(blogPost);
        return new ResponseEntity<>(createdBlogPost, HttpStatus.CREATED);
    }

    // You can add GET by ID, PUT, DELETE methods here
}