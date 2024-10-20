package com.hussain.springbootproject.service;

import com.hussain.springbootproject.model.JobPost;
import com.hussain.springbootproject.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public List<JobPost> returnAllJobPosts() {
        return repo.returnAllJobPosts();
    }

    //method to add a jobPost
    public void addJobPost(JobPost jobPost){
        repo.addJobPost(jobPost);
    }
}
