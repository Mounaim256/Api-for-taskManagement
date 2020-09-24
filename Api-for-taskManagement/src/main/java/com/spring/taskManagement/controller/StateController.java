package com.spring.taskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.taskManagement.model.State;
import com.spring.taskManagement.service.StateService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/taskManagement")
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@GetMapping("/states")
	public List<State> getAllStates(){
		return stateService.getStates();
	}
	
	@GetMapping("/states/{id}")
	public State getState(@PathVariable Long id){
		return stateService.getState(id);
	}
	
	@PostMapping("/states")
	public State addState(@RequestBody State state){
		return stateService.addState(state);
	}
	
	@PutMapping("/states")
	public State updateState(@RequestBody State state){
		return stateService.updateState(state);
	}
	
	@DeleteMapping("/states/{id}")
	public State deleteState(@PathVariable Long id){
		return stateService.deleteState(id);
	}

}
