package com.hussain.service;


import com.hussain.dao.QuizDao;
import com.hussain.feign.QuizInterface;
import com.hussain.model.Question;
import com.hussain.model.QuestionWrapper;
import com.hussain.model.Quiz;
import com.hussain.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Integer> questions = quizInterface.getQuestionsForQuiz(category,numQ).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionsIds(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("SUCCESS", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Quiz quiz =quizDao.findById(id).get();
        List<Integer> questionsIds = quiz.getQuestionsIds();
        quizInterface.getQuestionsFromId(questionsIds);
        ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionsIds);

        return questions;
    }

    public ResponseEntity<Integer> calulateResult(Integer id, List<Response> responses) {
        ResponseEntity<Integer> score =quizInterface.getScore(responses);
        return score;

    }
}
/*
Load balancing in microservices is the process of distributing incoming network traffic across multiple service instances to ensure no single instance is overwhelmed, thus improving:

⚡ Performance

📈 Scalability

✅ Availability

🔄 Fault tolerance
 */