package com.spring.taskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.taskManagement.model.Sector;
import com.spring.taskManagement.service.SectorService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="taskManagement")
public class SectorController {

	@Autowired
	private SectorService sectorService;
	
	@GetMapping("/sectors")
	public List<Sector> getAllSectors(){
		return sectorService.getSectors();
	}
	
	/*@GetMapping("/sectors/{id}")
	public Sector getSector(@PathVariable Long id){
		return sectorService.getSector(id);
	}*/
	
	@GetMapping("/sectors/{id}")
	public List<Sector> getSectorByProjectId(@PathVariable Long id){
		return sectorService.getSectorsByProjectId(id);
	}
	
	@PostMapping("/sectors")
	public Sector addSector(@RequestBody Sector sector){
		return sectorService.addSector(sector);
	}
	
	@DeleteMapping("/sectors/{id}")
	public Sector deleteSector(@PathVariable Long id){
		return sectorService.deleteSector(id);
	}
}
