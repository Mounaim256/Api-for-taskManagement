package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.StudyType;

@Repository
public interface StudyTypeRepository extends JpaRepository<StudyType, Long>{
	StudyType findByName(String name);
}
