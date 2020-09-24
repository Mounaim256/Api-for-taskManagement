package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	AppUser findByUsername(String name);
}
