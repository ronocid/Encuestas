package com.coderalia.encuestas.controllers;

import com.coderalia.encuestas.domain.Question;
import com.coderalia.encuestas.domain.forms.QuestionForm;
import com.coderalia.encuestas.services.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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
		model.addAttribute("newQuestionForm", new QuestionForm());
		return "addQuestion";
	}
	
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String processAddNewQuestionForm(@ModelAttribute("newQuestionForm") QuestionForm newQuestionForm){
		questionService.addQuestion(newQuestionForm.getQuestion());	
		return "redirect:/question";
	}
}
