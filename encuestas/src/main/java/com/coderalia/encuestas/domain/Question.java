package com.coderalia.encuestas.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	
	
}
