package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
