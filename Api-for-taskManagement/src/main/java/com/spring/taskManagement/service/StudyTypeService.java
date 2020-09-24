package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.StudyType;

public interface StudyTypeService {
	Set<StudyType> getStudyTypes();
	StudyType getStudyType();
	boolean addStudyType(StudyType studyType);
	boolean updateStudyType(StudyType studyType);
	boolean deleteStudyType(int id);
}
