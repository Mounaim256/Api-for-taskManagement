package com.spring.taskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.taskManagement.model.Pole;
import com.spring.taskManagement.service.PoleService;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/taskManagement")
public class PoleController {

	@Autowired
	private PoleService poleService;

	@GetMapping("/poles")
	public List<Pole> getAllPoles() {
		return poleService.getPoles();
	}

	@GetMapping("/poles/{id}")
	public Pole getPole(@PathVariable Long id) {
		return poleService.getPole(id);
	}

	@PostMapping("/poles")
	public Pole addPole(@RequestBody Pole pole) {
		return poleService.addPole(pole);
	}

	@PutMapping("/poles")
	public Pole updatePole(@RequestBody Pole pole) {
		return poleService.updatePole(pole);
	}

	@DeleteMapping("/poles/{id}")
	public Pole deletePole(@PathVariable Long id) {
		return poleService.deletePole(id);
	}
}
