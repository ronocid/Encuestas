package com.coderalia.encuestas.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity(name="questions")
@Table(name="questions")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {
	@Id
	@Column(name="id_question")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String questionText;
	@OneToMany
	@JoinColumn(name="id_question")
	private List<Answer> answers;
	
	public List<Answer> getListAnswers() {
		return answers;
	}
	public void setListAnswers(List<Answer> listAnswers) {
		this.answers = listAnswers;
	}
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
