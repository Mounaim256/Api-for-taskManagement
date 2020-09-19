package com.spring.taskManagement.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.AppRole;
import com.spring.taskManagement.repository.AppRoleRepository;

@Service
public class AppRoleServiceImpl implements AppRoleService {

	@Autowired
	private AppRoleRepository roleRepository;
	
	@Override
	public Set<AppRole> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppRole getRole(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRole(AppRole role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role) != null ? true : false;
	}

	@Override
	public boolean updateRole(AppRole role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRole(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
