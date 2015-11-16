package com.coderalia.encuestas.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "question")
	private Collection<Answer> answers = new LinkedHashSet<Answer>();
	
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
	
	public Collection<Answer> getAnswers(){
		return answers;
	}
	
	public void setAnswers(List<Answer> answers){
		this.answers = answers;
	}
}
