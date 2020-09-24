package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.Task;

public interface TaskService {
	List<Task> getTasks();
	Task getTask(Long id);
	Task getTaskByName(String name);
	boolean addTask(Task task);
	boolean updateTask(Task task);
	boolean deleteTask(int id);
}
