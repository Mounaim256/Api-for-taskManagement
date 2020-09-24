package com.spring.taskManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.State;
import com.spring.taskManagement.repository.StateRepository;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<State> getStates() {
		return stateRepository.findAll();
	}

	@Override
	public State getState(Long id) {
		Optional<State> state = stateRepository.findById(id);
		return state.isPresent() ? state.get() : null;
	}

	@Override
	public State addState(State state) {
		return state != null ? stateRepository.save(state) : null;
	}

	@Override
	public State updateState(State state) {
		if(state != null) {
			State st = stateRepository.findById(state.getId()).get();
			st.setName(state.getName());
			stateRepository.save(st);
			return st;
		}
		return  null;
	}

	@Override
	public State deleteState(Long id) {
		Optional<State> state = stateRepository.findById(id);
		if (state.isPresent()) {
			stateRepository.delete(state.get());
			return state.get();
		}
		return null;
	}

}
