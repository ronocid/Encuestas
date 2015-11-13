package com.coderalia.encuestas.controllers;

import com.coderalia.encuestas.domain.Answer;
import com.coderalia.encuestas.domain.Question;
import com.coderalia.encuestas.services.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
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
		Question newQuestion = new Question();
		model.addAttribute("newQuestion", newQuestion);
		return "addQuestion";
	}
	
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String processAddNewQuestionForm(@ModelAttribute("newQuestion") Question newQuestion){
		Answer answer1 = new Answer();
		answer1.setText("Congratulations");
		answer1.setQuestion(newQuestion);
		Answer answer2 = new Answer();
		answer2.setText("Son of a bitch");
		answer2.setQuestion(newQuestion);
		
		newQuestion.setAnswers(Arrays.asList(answer1,answer2));
		questionService.addQuestion(newQuestion);	
		return "redirect:/question";
	}
}
