package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.StudyType;

public interface StudyTypeService {
	List<StudyType> getStudyTypes();
	StudyType getStudyType();
	StudyType addStudyType(StudyType studyType);
	boolean updateStudyType(StudyType studyType);
	StudyType deleteStudyType(Long id);
}
