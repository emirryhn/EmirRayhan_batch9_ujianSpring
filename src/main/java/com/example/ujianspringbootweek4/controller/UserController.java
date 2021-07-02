package com.example.ujianspringbootweek4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringbootweek4.entity.User;
import com.example.ujianspringbootweek4.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUsers")
	public List<User> saveUsers(@RequestBody List<User> user) {
		return userService.saveUsers(user);
	}
	
	@GetMapping("/getUserName/{user_name}")
	public List<User> findUserName(@PathVariable String user_name) {
		return userService.findByName(user_name);
	}
	
	@GetMapping("/getUserByCompanyId/{company_id}")
	public List<User> getUserByCompanyid(@PathVariable int company_id) {
		return userService.getUserByCompanyId(company_id);
	}
}
