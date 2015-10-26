package com.coderalia.encuestas.services.impl;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.coderalia.encuestas.domain.Question;
import com.coderalia.encuestas.repository.QuestionDAO;
import com.coderalia.encuestas.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	private QuestionDAO questionDAO;
	
	public QuestionServiceImpl(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    
		questionDAO = context.getBean(QuestionDAO.class);
	}
	
	public List<Question> getAllQuestions() {
		return questionDAO.getAllQuestions();
	}

}
