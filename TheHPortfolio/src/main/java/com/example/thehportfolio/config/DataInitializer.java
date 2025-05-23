package com.example.thehportfolio.config;

import com.example.thehportfolio.model.Project;
import com.example.thehportfolio.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initializeData(ProjectRepository projectRepository) {
        return args -> {
            if (projectRepository.count() == 0) {
                System.out.println("Initializing projects data...");
                projectRepository.saveAll(Arrays.asList(
                        createProject("TaskMaster Pro", "A collaborative task management platform with real-time updates, custom workflows, and integrated calendar.", "https://images.unsplash.com/photo-1517430816045-df4b7de11d1d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&h=340", "https://example.com/taskmaster", "https://github.com/example/taskmaster", "react,typescript,firebase", true),
                        createProject("WeatherWise", "Advanced weather forecasting application with interactive maps, historical data analysis, and personalized alerts.", "https://images.unsplash.com/photo-1592210454359-9043f067919b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&h=340", "https://example.com/weatherwise", "https://github.com/example/weatherwise", "react,node", true),
                        createProject("ShopStream", "A modern e-commerce platform with live inventory updates, integrated payment processing, and AI-powered product recommendations.", "https://images.unsplash.com/photo-1472851294608-062f824d29cc?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&h=340", "https://example.com/shopstream", "https://github.com/example/shopstream", "nextjs,node,mongodb", true),
                        createProject("CodeMentor", "Interactive coding platform with live code execution, guided tutorials, and personalized learning paths for web development.", "https://images.unsplash.com/photo-1516116216624-53e697fedbea?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&h=340", "https://example.com/codementor", "https://github.com/example/codementor", "react,typescript,aws", true),
                        createProject("FitTrack", "Comprehensive fitness tracking application with customizable workout plans, progress analytics, and nutrition monitoring.", "https://images.unsplash.com/photo-1476480862126-209bfaa8edc8?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&h=340", "https://example.com/fittrack", "https://github.com/example/fittrack", "react,graphql,express", true),
                        createProject("MetricsMaster", "Comprehensive analytics dashboard with customizable widgets, real-time data visualization, and automated reporting features.", "https://images.unsplash.com/photo-1551288049-bebda4e38f71?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&h=340", "https://example.com/metricsmaster", "https://github.com/example/metricsmaster", "node,typescript,d3js", true)
                ));
            }
        };
    }

    private Project createProject(String name, String description, String imageUrl, String projectUrl, String githubUrl, String technologies, boolean isActive) {
        Project project = new Project();
        project.setName(name);
        project.setDescription(description);
        project.setImageUrl(imageUrl);
        project.setProjectUrl(projectUrl);
        project.setGithubUrl(githubUrl);
        project.setTechnologies(technologies);
        project.setIsActive(isActive);
        return project;
    }
}
