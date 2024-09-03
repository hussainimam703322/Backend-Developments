package com.hussain.springboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //if two class implementing same interface then there will be bean error if we call interface directly
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Desktop implements computer...");
    }
}
