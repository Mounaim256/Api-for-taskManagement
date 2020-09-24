package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.State;

public interface StateService {
	List<State> getStates();
	State getState(Long id);
	State addState(State state);
	State updateState(State state);
	State deleteState(Long id);
}
