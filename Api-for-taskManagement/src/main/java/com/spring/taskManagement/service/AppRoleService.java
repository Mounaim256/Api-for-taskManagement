package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.AppRole;

public interface AppRoleService {
	Set<AppRole> getRoles();
	AppRole getRole();
	boolean addRole(AppRole user);
	boolean updateRole(AppRole user);
	boolean deleteRole(int id);
}
