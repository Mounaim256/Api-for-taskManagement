package com.spring.taskManagement.service;

import java.util.List;

import com.spring.taskManagement.model.AppUser;

public interface AppUserService {
	List<AppUser> getUsers();
	AppUser getUser(long id);
	AppUser addUser(AppUser user);
	boolean updateUser(AppUser user);
	boolean deleteUser(long id);
}
