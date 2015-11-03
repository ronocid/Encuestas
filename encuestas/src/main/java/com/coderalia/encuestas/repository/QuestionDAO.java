package com.coderalia.encuestas.repository;

import java.util.List;

import com.coderalia.encuestas.domain.Question;

public interface QuestionDAO {
	public List<Question> getAllQuestions();
	Question addQuestion(Question newQuestion);
}
