package com.coderalia.encuestas.repository;

import com.coderalia.encuestas.domain.Question;

import java.util.List;

public interface QuestionDAO {
	List<Question> getAllQuestions();
}
