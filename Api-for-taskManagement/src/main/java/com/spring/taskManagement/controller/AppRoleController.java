package com.spring.taskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.taskManagement.model.AppRole;
import com.spring.taskManagement.service.AppRoleService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/taskManagement")
public class AppRoleController {
	@Autowired
	private AppRoleService roleService;
	
	@GetMapping("/roles")
	public List<AppRole> getAllRoles(){
		return roleService.getRoles();
	}
	
	@GetMapping("/roles/{id}")
	public AppRole getRole(@PathVariable Long id){
		return roleService.getRole(id);
	}
	
	@PostMapping("/roles")
	public AppRole addRole(@RequestBody AppRole role){
		return roleService.addRole(role);
	}
	
	@DeleteMapping("/roles/{id}")
	public AppRole deleteRole(@PathVariable Long id){
		return roleService.deleteRole(id);
	}
}
