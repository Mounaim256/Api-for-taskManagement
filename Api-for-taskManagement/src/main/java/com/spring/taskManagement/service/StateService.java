package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.State;

public interface StateService {
	Set<State> getStates();
	State getState();
	boolean addState(State user);
	boolean updateState(State user);
	boolean deleteState(int id);
}
