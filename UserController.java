package com.drhg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.drhg.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	//handler method to handle list of users and return model and view
	
	@GetMapping("/users")
	public String getUsers(Model model) {
		model.addAttribute("users",userService.getallUsers());
		return "users";
		
	}
	
}
