package com.spring.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.AppRole;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

}
