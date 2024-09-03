package com.example.springxml;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringxmlApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //above will only responsible for creating object

        //setter injection
        Alien obj1 = (Alien) context.getBean("Alien1");
//        Alien obj1 = context.getBean("Alien", Alien.class); we will use like this instead of typecasting
        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
    }
}

/*
object creation and scope concept

        Alien obj1 = (Alien) context.getBean("Alien1");
        obj1.age = 21;
        System.out.println(obj1.age);

        Alien obj2 = (Alien) context.getBean("Alien1");
        System.out.println(obj2.age);

                obj1.compile();
 */

//even there are two objects are created but output will be same in both object
//beacause it doesn't matter how many times you say get bean, it will go for the same reference object
//SCOPE - singleton, prototype
//if we assign singleton means it will refer the same object in bean and its by default
//But if we want different objects created every time then we say to bean to use another scope called prototype
//for more detail visit  https://www.geeksforgeeks.org/singleton-and-prototype-bean-scopes-in-java-spring/