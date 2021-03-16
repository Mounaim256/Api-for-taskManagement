package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.Pole;

public interface PoleService {
	List<Pole> getPoles();
	List<Pole> getPolesByTaskId(Long id);
	List<Pole> getPolesByProjectId(Long id);
	List<Pole> getPolesNotAffected();
	Pole getPole(Long id);
	Pole addPole(Pole pole);
	Pole updatePole(Pole pole);
	Pole deletePole(Long id);
}
