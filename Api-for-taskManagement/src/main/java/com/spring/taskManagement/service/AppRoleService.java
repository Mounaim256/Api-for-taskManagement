package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.AppRole;

public interface AppRoleService {
	Set<AppRole> getRoles();
	AppRole getRole(long id);
	boolean addRole(AppRole role);
	boolean updateRole(AppRole role);
	boolean deleteRole(long id);
}
