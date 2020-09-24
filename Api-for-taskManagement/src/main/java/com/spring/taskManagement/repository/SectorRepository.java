package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long>{
	Sector findByName(String name);
}
