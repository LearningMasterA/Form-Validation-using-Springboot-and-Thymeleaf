package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.entities.loginData;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@GetMapping("/form")
	public String openForm(Model m) {
		System.out.println("Opening Form");
		m.addAttribute("loginData",new loginData());
		return "form";
	}
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") loginData loginData,BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "form";
		}
		System.out.println(loginData);
		return "success";
	}

}
