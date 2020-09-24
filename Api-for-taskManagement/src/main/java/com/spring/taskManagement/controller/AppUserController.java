package com.spring.taskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.taskManagement.model.AppUser;
import com.spring.taskManagement.service.AppUserService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/taskManagement")
public class AppUserController {
	
	@Autowired
	private AppUserService userService;
	
	@GetMapping("/users")
	public List<AppUser> getAllUser(){
		return userService.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public AppUser getUser(@PathVariable Long id){
		return userService.getUser(id);
	}
	
	@PostMapping("/users")
	public AppUser addUser(@RequestBody AppUser user) {
		return userService.addUser(user);
	}
}
