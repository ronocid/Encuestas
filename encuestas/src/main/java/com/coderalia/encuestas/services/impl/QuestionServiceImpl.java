package com.coderalia.encuestas.services.impl;

import com.coderalia.encuestas.domain.Question;
import com.coderalia.encuestas.repository.QuestionDAO;
import com.coderalia.encuestas.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionDAO questionDAO;
	
	public List<Question> getAllQuestions() {
		return questionDAO.getAllQuestions();
	}

	public Question addQuestion(Question newQuestion) {
		return questionDAO.addQuestion(newQuestion);
	}

}
