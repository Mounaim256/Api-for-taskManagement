package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.Pole;

public interface PoleService {
	Set<Pole> getPoles();
	Pole getPole();
	boolean addPole(Pole user);
	boolean updatePole(Pole user);
	boolean deletePole(int id);
}
