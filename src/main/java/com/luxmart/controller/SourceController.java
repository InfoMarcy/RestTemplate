package com.luxmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxmart.model.User;
import com.luxmart.service.ApiService;

@RestController
@RequestMapping("/api/v1/users")
public class SourceController {
	@Autowired
	ApiService apiService;
	
	@GetMapping("/{limit}")
	public List<User> getUsers(@PathVariable("limit") String limit){
		
		return apiService.getUsers(Integer.parseInt(limit) -1);
	}

}
