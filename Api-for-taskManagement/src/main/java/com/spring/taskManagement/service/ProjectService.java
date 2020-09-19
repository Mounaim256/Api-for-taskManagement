package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.Project;

public interface ProjectService {
	Set<Project> getProjects();
	Project getProject();
	boolean addProject(Project user);
	boolean updateProject(Project user);
	boolean deleteProject(int id);
}
