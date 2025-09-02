package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.entities.loginData;

@Controller
public class MainController {
	@GetMapping("/form")
	public String openForm(Model m) {
		System.out.println("Opening Form");
		m.addAttribute("loginData",new loginData());
		return "form";
	}
	@PostMapping("/process")
	public String processForm(@ModelAttribute("loginData") loginData loginData) {
		System.out.println(loginData);
		return "success";
	}

}
