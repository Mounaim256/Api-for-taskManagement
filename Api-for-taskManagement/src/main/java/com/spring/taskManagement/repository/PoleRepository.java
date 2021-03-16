package com.spring.taskManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.Pole;

@Repository
public interface PoleRepository extends JpaRepository<Pole, Long>{
	Pole findByName(String name);
	List<Pole> findByTaskId(Long id);
	List<Pole> findByTaskIdIsNull();
	List<Pole> findByTaskSectorProjectId(Long id);
}
