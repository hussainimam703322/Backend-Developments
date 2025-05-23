package com.example.thehportfolio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String projectUrl;

    @Column(nullable = false)
    private String githubUrl;

    @Column(nullable = false)
    private String technologies;

    @Column(nullable = false)
    private boolean isActive;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return isActive;
    }
}
