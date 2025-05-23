package com.example.thehportfolio.service;


import com.example.thehportfolio.model.BlogPost;
import com.example.thehportfolio.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    public BlogPost saveBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }
}