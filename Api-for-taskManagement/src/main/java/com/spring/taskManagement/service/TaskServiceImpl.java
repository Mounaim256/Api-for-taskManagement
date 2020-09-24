package com.spring.taskManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.Task;
import com.spring.taskManagement.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public List<Task> getTasks() {
		return taskRepository.findAll();
	}

	@Override
	public Task getTask(Long id) {
		Optional<Task> task = taskRepository.findById(id);
		return task.isPresent() ? task.get() : null;
	}

	@Override
	public boolean addTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTask(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Task getTaskByName(String name) {
		return taskRepository.findByName(name);
	}

}
