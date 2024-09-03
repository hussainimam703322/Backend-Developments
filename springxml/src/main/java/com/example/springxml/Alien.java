package com.example.springxml;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter created");
        this.age = age;
    }

    private Computer com;
    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }




//    private Laptop lap;
//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public Alien(){
        System.out.println("object created");
    }

    //constructor injection
//    @ConstructorProperties({"age","lap"}) //this is used to remove the order sequence problem of parameter placed in spring.xml
//    public Alien(Laptop lap, int age) {
//        System.out.println("constructor injection ");
//        this.lap = lap;
//        this.age = age;
//    }

    public void code(){
        System.out.println("Compiling code");
//        lap.compile();
        com.compile();
    }
}
