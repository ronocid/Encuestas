package com.coderalia.encuestas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coderalia.encuestas.domain.Question;
import com.coderalia.encuestas.services.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionService questionService;

	@RequestMapping
	public String list(Model model){
		List<Question> questions = questionService.getAllQuestions();
		model.addAttribute("questions", questions);
		return "questions";
	}
}
