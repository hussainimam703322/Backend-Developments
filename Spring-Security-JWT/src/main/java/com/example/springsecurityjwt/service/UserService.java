package com.example.springsecurityjwt.service;


import com.example.springsecurityjwt.dao.UserRepo;
import com.example.springsecurityjwt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    AuthenticationManager authenticationManager;


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);


    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
       return repo.save(user);
    }
}
