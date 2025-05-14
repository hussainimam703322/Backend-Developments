package com.example.springsecurityjwt.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String Greet(HttpServletRequest request){
        return "Hey this is imam hussain" + request.getSession().getId();
    }


}
