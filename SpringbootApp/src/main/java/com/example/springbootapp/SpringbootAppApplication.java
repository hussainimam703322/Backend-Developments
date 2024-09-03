package com.example.springbootapp;

import com.example.springbootapp.Sevice.LaptopService;
import com.example.springbootapp.model.Alien;
import com.example.springbootapp.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootAppApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SpringbootAppApplication.class, args);
//       Alien obj = context.getBean(Alien.class);
//       obj.code();

        LaptopService service = context.getBean(LaptopService.class);
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);
    }

}
