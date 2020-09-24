package com.spring.taskManagement.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.Project;
import com.spring.taskManagement.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<Project> getProjects() {
		return projectRepository.findAll();
	}

	@Override
	public Project getProject(Long id) {
		Optional<Project> project = projectRepository.findById(id);
		return project.isPresent() ? project.get() : null;
	}

	@Override
	public Project addProject(Project project) {
		if(project != null) {
			project.setStartDate(LocalDateTime.now());
			return projectRepository.save(project);
		}
		return null;
	}

	@Override
	public boolean updateProject(Project project) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Project deleteProject(Long id) {
		Optional<Project> project = projectRepository.findById(id);
		if(project.isPresent()) {
			projectRepository.delete(project.get());
			return project.get();
		}
		return null;
	}

	@Override
	public Project getProjectByame(String name) {
		Optional<Project> project = projectRepository.findByName(name);
		return project.isPresent() ? project.get() : null;
	}

}
