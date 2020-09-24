package com.spring.taskManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.AppRole;
import com.spring.taskManagement.model.AppUser;
import com.spring.taskManagement.repository.AppUserRepository;

@Service
public class AppUserServiceImpl implements AppUserService {
	
	@Autowired
	private AppUserRepository userRepository;
	@Autowired
	private AppRoleService roleService;
	
	@Override
	public List<AppUser> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public AppUser getUser(long id) {
		Optional<AppUser> user = userRepository.findById(id);
		return user.isPresent() ? user.get() : null;
	}

	@Override
	public AppUser addUser(AppUser user) {
		
		if(user != null) {
			// add user
			AppUser appUser = new AppUser();
			appUser.setUsername(user.getUsername());
			appUser.setPassword(user.getPassword());
			userRepository.save(appUser);
			
			// get user 
			appUser = userRepository.findByUsername(user.getUsername());
			
			// get roles
			List<AppRole> roles = roleService.getRolesByName(user.getRoles());
			
			// add role to user
			appUser.setRoles(roles);
			
			// update user
			userRepository.save(appUser);
			
			
			return appUser;
		}
		return null;
	}

	@Override
	public boolean updateUser(AppUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
