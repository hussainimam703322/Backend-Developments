package com.example.springbootapp.repo;

import com.example.springbootapp.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("saved in database");
    }
}
