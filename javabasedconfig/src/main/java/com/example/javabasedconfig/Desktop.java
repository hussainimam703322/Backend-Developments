package com.example.javabasedconfig;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("desktop object created");
    }

    @Override
    public void compile(){
        System.out.println("desktop compiling");
    }

}
