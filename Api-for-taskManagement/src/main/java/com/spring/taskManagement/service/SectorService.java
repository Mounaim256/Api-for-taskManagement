package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.Sector;

public interface SectorService {
	List<Sector> getSectors();
	List<Sector> getSectorsByProjectId(Long id);
	Sector getSector(Long id);
	Sector addSector(Sector sector);
	boolean updateSector(Sector sector);
	Sector deleteSector(Long id);
}
