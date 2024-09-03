package com.hussain.springboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //@Component marks a Java class as a bean that Spring should manage.

public class Laptop implements Computer {
    public void compile() {
        System.out.println("laptop implements computer...");
    }
}
