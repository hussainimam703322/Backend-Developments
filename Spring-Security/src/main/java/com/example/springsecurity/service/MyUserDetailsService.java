package com.example.springsecurity.service;

import com.example.springsecurity.dao.UserRepo;
import com.example.springsecurity.model.User;
import com.example.springsecurity.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
       User user =  repo.findByUsername(username);
       if(user == null){
           System.out.println("User 404 found");
           throw new UsernameNotFoundException("User 404");
       }
        return new UserPrincipal(user);

    }
}

