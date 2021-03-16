package com.spring.taskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.taskManagement.model.Task;
import com.spring.taskManagement.service.TaskService;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/taskManagement")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
		return taskService.getTasks();
	}
	
	@GetMapping("/tasks/{id}")
	public Task getTask(@PathVariable Long id) {
		return taskService.getTask(id);
	}
	
	@GetMapping("/tasks/taskByProject/{id}")
	public List<Task> getTasksByProjectId(@PathVariable Long id) {
		return taskService.getTasksByProjectId(id);
	}
	
	@GetMapping("/tasks/taskByUser/{id}")
	public List<Task> getTasksByUserId(@PathVariable Long id) {
		return taskService.getTasksByUserId(id);
	}
	
	@PostMapping("/tasks")
	public Task addTask(@RequestBody Task task) {
		return taskService.addTask(task);
	}
	
	@PutMapping("/tasks")
	public Task updateTask(@RequestBody Task task) {
		return taskService.updateTask(task);
	}
}
