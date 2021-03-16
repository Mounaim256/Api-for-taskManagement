package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.Task;

public interface TaskService {
	List<Task> getTasks();
	List<Task> getTasksByProjectId(Long id);
	List<Task> getTasksByUserId(Long id);
	Task getTask(Long id);
	Task getTaskByName(String name);
	Task addTask(Task task);
	Task updateTask(Task task);
	boolean deleteTask(int id);
}
