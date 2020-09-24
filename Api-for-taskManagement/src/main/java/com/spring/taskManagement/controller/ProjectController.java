package com.spring.taskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.taskManagement.model.Project;
import com.spring.taskManagement.service.ProjectService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/taskManagement")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/projects")
	public List<Project> getAllProjects(){
		return projectService.getProjects();
	}
	
	@GetMapping("/projects/{id}")
	public Project getProject(@PathVariable Long id){
		return projectService.getProject(id);
	}
	
	@PostMapping("/projects")
	public Project addProject(@RequestBody Project project){
		return projectService.addProject(project);
	}
	
	@DeleteMapping("/projects/{id}")
	public Project deleteProject(@PathVariable Long id){
		return projectService.deleteProject(id);
	}
}
