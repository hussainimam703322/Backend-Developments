package com.example.thehportfolio.service;

import com.example.thehportfolio.model.Project;
import com.example.thehportfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public List<Project> getActiveProjects() { // Renamed from getFeaturedProjects
        return projectRepository.findByIsActiveTrue(); // Updated method call
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    // You can add more business logic here, e.g., get project by ID, update, delete
}
