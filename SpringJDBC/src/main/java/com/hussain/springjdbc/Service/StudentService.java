package com.hussain.springjdbc.Service;

import com.hussain.springjdbc.model.Student;
import com.hussain.springjdbc.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;
    public StudentRepo getRepo() {
        return repo;
    }
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }
    public void addStudent(Student s) {

        repo.save(s);
    }
    public List<Student> getStudents() {
        return repo.findAll();
    }
}