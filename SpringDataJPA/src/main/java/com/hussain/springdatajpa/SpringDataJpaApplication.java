package com.hussain.springdatajpa;

import com.hussain.springdatajpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
        StudentRepo repo = context.getBean(StudentRepo.class);

//        Student s1 = new Student();
//        s1.setRollNo(101);
//        s1.setName("Navin");
//        s1.setMarks(75);

        Student s2 = new Student();
        s2.setRollNo(102);
        s2.setName("Kiran");
        s2.setMarks(65);
//
//        Student s3 = new Student();
//        s3.setRollNo(103);
//        s3.setName("Harsh");
//        s3.setMarks(70);

//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

        //to get all data
        System.out.println(repo.findAll());
        
        //if there is no data always use optional
        Optional<Student> s = repo.findById(103);
        System.out.println(s.orElse(new Student()));

        //to get a specific data by using any enitity

        System.out.println(repo.findByName("Navin"));

        //update (set a value using getter and setter)
        repo.save(s2);

        //delete
        repo.delete(s2);
    }

}
