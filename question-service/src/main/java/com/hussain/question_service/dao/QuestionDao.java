package com.hussain.question_service.dao;

import com.hussain.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.id FROM question q WHERE category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)

    public List<Integer> findRandomQuestionsByCategory(@Param("category") String category,
                                                        @Param("numQ") int numQ);
}
