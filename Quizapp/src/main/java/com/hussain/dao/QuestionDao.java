package com.hussain.dao;

import com.hussain.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);


    @Query(value = "SELECT * FROM question WHERE category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)

    public List<Question> findRandomQuestionsByCategory(@Param("category") String category,
                                                        @Param("numQ") int numQ);
}
