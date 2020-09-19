package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.Sector;

public interface SectorService {
	Set<Sector> getSectors();
	Sector getSector();
	boolean addSector(Sector user);
	boolean updateSector(Sector user);
	boolean deleteSector(int id);
}
