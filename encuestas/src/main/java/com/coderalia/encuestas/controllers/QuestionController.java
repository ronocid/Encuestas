package com.coderalia.encuestas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="/add", method= RequestMethod.GET)
	public String getAddNewQuestionForm(Model model){
		Question newQuestion = new Question();
		model.addAttribute("newQuestion", newQuestion);
		return "addQuestion";
	}
	
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String processAddNewQuestionForm(@ModelAttribute("newQuestion") Question newQuestion){
		questionService.addQuestion(newQuestion);	
		return "redirect:/questions";
	}
}
