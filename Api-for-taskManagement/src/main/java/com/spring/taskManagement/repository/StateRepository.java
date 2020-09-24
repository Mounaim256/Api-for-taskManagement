package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
	State findByName(String name);
}
