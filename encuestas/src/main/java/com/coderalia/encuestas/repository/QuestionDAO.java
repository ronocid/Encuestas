package com.coderalia.encuestas.repository;

import java.util.List;

import com.coderalia.encuestas.domain.Question;

public interface QuestionDAO {
	public List<Question> getAllQuestions();
	public List<Question> insert(Question question);
}
