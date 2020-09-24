package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.Pole;

public interface PoleService {
	List<Pole> getPoles();
	Pole getPole(Long id);
	Pole addPole(Pole pole);
	Pole updatePole(Pole pole);
	Pole deletePole(Long id);
}
