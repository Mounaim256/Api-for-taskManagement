package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.taskManagement.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{

}
