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

import com.spring.taskManagement.model.StudyType;
import com.spring.taskManagement.service.StudyTypeService;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/taskManagement")
public class StudyTypeController {
	
	@Autowired
	private StudyTypeService studyTypeService;
	
	@GetMapping("/studytypes")
	public List<StudyType> getStudyTypes() {
		return studyTypeService.getStudyTypes();
	}
	
	@PostMapping("/studytypes")
	public StudyType addStudyType(@RequestBody StudyType studyType) {
		return studyTypeService.addStudyType(studyType);
	}
	
	@DeleteMapping("/studytypes/{id}")
	public StudyType deleteStudyType(@PathVariable Long id) {
		return studyTypeService.deleteStudyType(id);
	}
}
