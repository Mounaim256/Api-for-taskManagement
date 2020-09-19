package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
