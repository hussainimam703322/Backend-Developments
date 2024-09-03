package com.example.springxml;

public class Laptop implements Computer {

    public Laptop(){
        System.out.println("laptop was created");
    }

    @Override
    public void compile(){
        System.out.println("compiling laptop using autowired byname");
        System.out.println("object ref completed");
    }
}
