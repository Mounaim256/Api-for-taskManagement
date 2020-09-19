package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.Task;

public interface TaskService {
	Set<Task> getTasks();
	Task getTask();
	boolean addTask(Task user);
	boolean updateTask(Task user);
	boolean deleteTask(int id);
}
