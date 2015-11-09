package com.coderalia.encuestas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="answers")
@Table(name="answers")
public class Answer {
	@Id
	@Column(name="id_answer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String text;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}
