package com.spring.taskManagement.service;

import java.util.Set;

import com.spring.taskManagement.model.AppUser;

public interface AppUserService {
	Set<AppUser> getUsers();
	AppUser getUser(long id);
	boolean addUser(AppUser user);
	boolean updateUser(AppUser user);
	boolean deleteUser(long id);
}
