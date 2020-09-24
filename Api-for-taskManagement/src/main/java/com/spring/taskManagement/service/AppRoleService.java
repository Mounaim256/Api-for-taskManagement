package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.AppRole;

public interface AppRoleService {
	List<AppRole> getRoles();
	List<AppRole> getRolesByName(List<AppRole> roles);
	AppRole getRole(long id);
	AppRole addRole(AppRole role);
	boolean updateRole(AppRole role);
	AppRole deleteRole(long id);
}
