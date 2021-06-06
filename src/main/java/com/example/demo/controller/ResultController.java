package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.MyNameForm;

@Controller
public class ResultController {
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String result(Model model, MyNameForm myNameForm) {
		model.addAttribute("myName", myNameForm.getMyName());
		return "result";
	}
}
