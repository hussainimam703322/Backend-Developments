package com.example.javabasedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.javabasedconfig.Laptop;
import com.example.javabasedconfig.Desktop;
import com.example.javabasedconfig.Alien;
import org.springframework.context.annotation.Primary;

import java.security.PublicKey;

@Configuration //this is used for java based configuration
@ComponentScan("com.example.javabasedconfig")
public class Appconfig {

//    @Bean
//    public Alien alien(Computer comp){ //@Autowired even you use this or not it will work
//        // @Qualifier("desktop") we can use this in above function
//        // to specify the bean which we want to execute or we can use Primary
//        Alien obj= new Alien();
//        obj.setAge(25);
//        obj.setComp(comp);
//        return obj;
//    }
//
//    //bean is injecting the object and spring will manage the object and create the object
//    //@Bean(name={"com1","desktop1","beast"}) we can multiples name for object
//    @Bean
//    public Desktop desktop(){
//        return new Desktop(); // since this java based configuration we have to manually create this object
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
