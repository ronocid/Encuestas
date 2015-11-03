package com.coderalia.encuestas.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.coderalia.encuestas.domain.Question;
import com.coderalia.encuestas.repository.QuestionDAO;

@Repository
public class QuestionDAOImpl implements QuestionDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Question> getAllQuestions() {
		Session session = this.sessionFactory.openSession();
	    List<Question> questionList = session.createQuery("from questions").list();
	    session.close();
	    return questionList;
	}
	
	public Question addQuestion(Question newQuestion) {
		Session session = this.sessionFactory.openSession();
		session.save(newQuestion);
	    session.close();
	    return newQuestion;
	}

	
	

}
