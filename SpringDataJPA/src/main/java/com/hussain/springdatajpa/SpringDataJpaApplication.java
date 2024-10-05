package com.hussain.springdatajpa;

import com.hussain.springdatajpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
        StudentRepo repo = context.getBean(StudentRepo.class);

        // Create and save students manually
        Student s1 = new Student();
        s1.setRollNo(101);
        s1.setName("Navin");
        s1.setMarks(75);

        Student s2 = new Student();
        s2.setRollNo(102);
        s2.setName("Kiran");
        s2.setMarks(80);

        Student s3 = new Student();
        s3.setRollNo(103);
        s3.setName("Harsh");
        s3.setMarks(70);

        repo.save(s1);
        repo.save(s2);
        repo.save(s3);
    }
}
