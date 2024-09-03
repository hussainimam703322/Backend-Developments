package com.example.javabasedconfig;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavabasedconfigApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
//        Desktop dt = context.getBean("desktop",Desktop.class);
//        dt.compile();

        Alien obj = context.getBean(Alien.class);
        obj.code();
    }
}
