package com.coderalia.encuestas.services;

import com.coderalia.encuestas.domain.Question;

import java.util.List;

public interface QuestionService {

	List<Question> getAllQuestions();
	Question addQuestion(Question newQuestion);
}
