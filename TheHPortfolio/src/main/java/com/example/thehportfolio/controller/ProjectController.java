package com.example.thehportfolio.controller;

import com.example.thehportfolio.model.Project;
import com.example.thehportfolio.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@Validated // Optional, ensures validation is triggered in the controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        List<Project> projects = projectService.getAllProjects();
        return ResponseEntity.ok(projects);
    }

    @GetMapping("/featured")
    public ResponseEntity<List<Project>> getFeaturedProjects() {
        List<Project> featuredProjects = projectService.getActiveProjects();
        return ResponseEntity.ok(featuredProjects);
    }

    @PostMapping
    public ResponseEntity<?> createProject(@Valid @RequestBody Project project, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Return a Bad Request response with validation errors
            return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
        }
        Project createdProject = projectService.saveProject(project);
        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }

    // You can add GET by ID, PUT, DELETE methods here
}
