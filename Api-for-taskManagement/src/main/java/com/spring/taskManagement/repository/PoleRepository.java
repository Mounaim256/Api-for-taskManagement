package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.Pole;

@Repository
public interface PoleRepository extends JpaRepository<Pole, Long>{

}
