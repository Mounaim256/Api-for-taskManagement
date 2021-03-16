package com.spring.taskManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.StudyType;
import com.spring.taskManagement.repository.StudyTypeRepository;

@Service
public class StudyTypeServiceImpl implements StudyTypeService {
	
	@Autowired
	private StudyTypeRepository studyTypeRepository;

	@Override
	public List<StudyType> getStudyTypes() {
		// TODO Auto-generated method stub
		return studyTypeRepository.findAll();
	}

	@Override
	public StudyType getStudyType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudyType addStudyType(StudyType studyType) {
		// TODO Auto-generated method stub
		return studyType != null ? studyTypeRepository.save(studyType) : null;
	}

	@Override
	public boolean updateStudyType(StudyType studyType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StudyType deleteStudyType(Long id) {
		Optional<StudyType> studyType = studyTypeRepository.findById(id);
		if(studyType.isPresent()) {
			studyTypeRepository.delete(studyType.get());
			return studyType.get();
		}
		return null;
	}

}
