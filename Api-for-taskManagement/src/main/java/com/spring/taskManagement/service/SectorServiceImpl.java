package com.spring.taskManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.Project;
import com.spring.taskManagement.model.Sector;
import com.spring.taskManagement.repository.SectorRepository;

@Service
public class SectorServiceImpl implements SectorService {

	@Autowired
	private SectorRepository sectorRepository;

	@Autowired
	private ProjectService projectService;

	@Override
	public List<Sector> getSectors() {
		return sectorRepository.findAll();
	}

	@Override
	public Sector getSector(Long id) {
		Optional<Sector> sector = sectorRepository.findById(id);
		return sector.isPresent() ? sector.get() : null;
	}

	@Override
	public Sector addSector(Sector sector) {
		if (sector != null) {
			Project project = projectService.getProjectByame(sector.getProject().getName());
			sector.setProject(project);
			return sectorRepository.save(sector);
		}
		return null;
	}

	@Override
	public boolean updateSector(Sector sector) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Sector deleteSector(Long id) {
		Optional<Sector> sector = sectorRepository.findById(id);
		if (sector.isPresent()) {
			sectorRepository.delete(sector.get());
			return sector.get();
		}
		return null;
	}
	
}
