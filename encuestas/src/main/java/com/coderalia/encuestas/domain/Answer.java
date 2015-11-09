package com.coderalia.encuestas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name="answers")
@Table(name="answers")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Answer {
	@Id
	@Column(name="id_answer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answerText;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAnswerText() {
		return answerText;
	}
	
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
}
