package com.example.springboot_datarest.repo;
import com.example.springboot_datarest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    //List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}