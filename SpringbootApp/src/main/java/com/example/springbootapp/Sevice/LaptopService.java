package com.example.springbootapp.Sevice;

import com.example.springbootapp.repo.LaptopRepository;
import com.example.springbootapp.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service annotation is used with classes that provide some business functionalities.
//the business logic resides within the service layer, so we use the @Service Annotation to indicate that a class belongs to that layer.
@Service //we can only apply to 2 classes only .It is specialization of component and repository
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }
    public boolean isGoodprogram(Laptop lap){
        return true;
    }



}
