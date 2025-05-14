package com.example.springsecurityjwt.controller;

import com.example.springsecurityjwt.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Imam", "Java"),
            new Student(2,"Naveen", "Springboot ")
    ));

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }
    @PostMapping("students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
    @GetMapping("csrf-token")
    public Object getCsrfToken(HttpServletRequest request){
         return request.getAttribute("_csrf");
    }
}
/*
It is a cookie attribute that tells the browser when cookies should be sent —
specifically related to cross-site requests (requests from another website).
 */