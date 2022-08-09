package com.qa_management.repository;

import com.qa_management.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("from Question")
    public Set<Question> getAllQuestions();

    public Question getQuestionById(long id);

    @Query(value = "SELECT * FROM question where enabled=true ORDER BY id desc ", nativeQuery = true)
    public Set<Question> getAllEnabledQuestions();

    public Set<Question> findByQuestionContaining(String question);

}
