package com.qa_management.repository;

import com.qa_management.model.Answer;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.*;
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    @Query(value = "SELECT * FROM answer where question_id = ?1", nativeQuery = true)
    public Set<Answer> getAllAnswersByQuestionId(Long id);

    @Query(value = "SELECT * FROM answer where question_id =?1 and enabled=true", nativeQuery = true)
    public Set<Answer> getAllEnabledAnswersByQuestionId(Long id);

    @Query(value = "SELECT * FROM answer where question_id = ?1", nativeQuery = true)
    public Answer getAnswerByQuestionId(Long id);

    @Query(value = "SELECT * FROM answer where user_id = ?1 and enabled = true", nativeQuery = true)
    public Set<Answer> getAllAnswersUserId(Long id);

    public Answer getAnswerById(Long id);

    public Answer deleteAnswerById(Long id);
}
