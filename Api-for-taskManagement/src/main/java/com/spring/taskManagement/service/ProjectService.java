package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.Project;

public interface ProjectService {
	List<Project> getProjects();
	Project getProject(Long id);
	Project getProjectByame(String name);
	Project addProject(Project project);
	boolean updateProject(Project project);
	Project deleteProject(Long id);
}
