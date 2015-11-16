package com.coderalia.encuestas.domain.forms;

import java.util.Arrays;

import com.coderalia.encuestas.domain.Answer;
import com.coderalia.encuestas.domain.Question;

public class QuestionForm {
	private Question question;
	private Answer answer1;
	private Answer answer2;
	
	public QuestionForm() {
		this.question = new Question();
		this.answer1 = new Answer();
		this.answer2 = new Answer();
		this.answer1.setQuestion(question);
		this.answer2.setQuestion(question);
	}
	public Question getQuestion() {
		question.setAnswers(Arrays.asList(answer1,answer2));
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer getAnswer1() {
		return answer1;
	}
	public void setAnswer1(Answer answer1) {
		this.answer1 = answer1;
	}
	public Answer getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Answer answer2) {
		this.answer2 = answer2;
	}
		
}
