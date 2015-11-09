package com.coderalia.encuestas.controllers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderalia.encuestas.domain.Question;
import com.coderalia.encuestas.services.QuestionService;

@Controller
@RequestMapping("/api/question")
public class QuestionApiController {
	@Autowired
	private QuestionService questionService;

	@RequestMapping
	public String list(Model model){
		List<Question> questions = questionService.getAllQuestions();
		model.addAttribute("questions", questions);
		return "questions";
	}
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public @ResponseBody Question add(@RequestBody Question newQuestion ){
		return questionService.addQuestion(newQuestion);
	}
}
