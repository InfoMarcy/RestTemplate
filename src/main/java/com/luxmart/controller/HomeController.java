package com.luxmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.luxmart.service.ApiService;

@Controller
public class HomeController {
	@Autowired
	ApiService apiService;
	
	//https://www.youtube.com/watch?v=5K6NNX-GGDI? lombok install
	@GetMapping("/users/{limit}")
	public String getUsers(Model model, @PathVariable("limit") String limit) {
		
		int amount = Integer.parseInt(limit);
		model.addAttribute("users", apiService.getUsers(amount));
		
		return "users";
	}

}
