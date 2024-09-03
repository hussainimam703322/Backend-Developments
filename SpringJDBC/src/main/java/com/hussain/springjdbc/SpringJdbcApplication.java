package com.hussain.springjdbc;

import com.hussain.springjdbc.Service.StudentService;
import com.hussain.springjdbc.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
        Student s = context.getBean(Student.class);
        s.setRollNo(107);
        s.setMarks(100);
        s.setName("ansari");
        


        StudentService service = context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> students = service.getStudents();
        System.out.println(students);
    }

}
