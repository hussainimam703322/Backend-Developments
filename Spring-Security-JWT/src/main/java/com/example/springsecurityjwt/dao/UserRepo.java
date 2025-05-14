package com.example.springsecurityjwt.dao;


import com.example.springsecurityjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
     User findByUsername(String username);
}
