package com.spring.taskManagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.AppRole;
import com.spring.taskManagement.repository.AppRoleRepository;

@Service
public class AppRoleServiceImpl implements AppRoleService {

	@Autowired
	private AppRoleRepository roleRepository;
	
	@Override
	public List<AppRole> getRoles() {
		return roleRepository.findAll();
	}

	@Override
	public AppRole getRole(long id) {
		Optional<AppRole> role = roleRepository.findById(id);
		return role.isPresent() ? role.get() : null;
	}

	@Override
	public AppRole addRole(AppRole role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public boolean updateRole(AppRole role) {
		return false;
	}

	@Override
	public AppRole deleteRole(long id) {
		Optional<AppRole> role = roleRepository.findById(id);
		if(role.isPresent()) {
			roleRepository.delete(role.get());
			return role.get();
		}
		return null;
	}

	@Override
	public List<AppRole> getRolesByName(List<AppRole> roles) {
		List<AppRole> appRoles = new ArrayList<AppRole>();
		if(roles != null) {
			roles.forEach(role ->{
				Optional<AppRole> optional = Optional.ofNullable(roleRepository.findByName(role.getName()));
				if(optional.isPresent()) {
					appRoles.add(optional.get());
				}
			});
		}
		return appRoles;
	}

}
