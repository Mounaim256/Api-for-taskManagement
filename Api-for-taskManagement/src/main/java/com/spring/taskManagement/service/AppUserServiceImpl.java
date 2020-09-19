package com.spring.taskManagement.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.AppUser;
import com.spring.taskManagement.repository.AppUserRepository;

@Service
public class AppUserServiceImpl implements AppUserService {
	
	@Autowired
	private AppUserRepository userRepository;
	
	@Override
	public Set<AppUser> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(AppUser user) {
		// TODO Auto-generated method stub
		return userRepository.save(user) != null ? true : false;
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
