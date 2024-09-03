package com.hussain.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //field injection
//  private Laptop laptop;
    private Computer comp; //it will work becz laptop is over Computer

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public Dev(){
        System.out.println("Dev constructor");
    }



    public void build(){
        comp.compile();

        //laptop.compile();
        System.out.println("working on awesome project");
    }
}
