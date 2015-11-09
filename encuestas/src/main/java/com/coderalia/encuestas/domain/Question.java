package com.coderalia.encuestas.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import javax.persistence.*;

@Entity(name="questions")
@Table(name="questions")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {
	@Id
	@Column(name="id_question")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String questionText;
	private List<Answer> answers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "answers")
	public List<Answer> getAnswers(){
		return answers;
	}
	
	public void setAnswers(List<Answer> answers){
		this.answers = answers;
	}
}
