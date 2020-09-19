package com.spring.taskManagement.util;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.taskManagement.model.AppRole;
import com.spring.taskManagement.model.AppUser;
import com.spring.taskManagement.repository.AppRoleRepository;
import com.spring.taskManagement.repository.AppUserRepository;

@Component
public class FirstTimeInitializer implements CommandLineRunner {

	@Autowired
	private AppRoleRepository roleRepository;
	@Autowired
	private AppUserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Stream.of("ADMIN", "SUPERVISOR", "RESPONSIBLE").forEach(roleName -> {
			AppRole role = new AppRole();
			role.setName(roleName);
			roleRepository.save(role);
		});

		Set<AppRole> roles = new HashSet<>();

		Stream.of("ADMIN", "SUPERVISOR", "RESPONSIBLE").forEach(roleName -> {
			AppRole role = roleRepository.findByName(roleName);
			roles.add(role);
		});

		AppUser user = new AppUser();
		user.setUsername("said");
		user.setPassword("123456789");
		user.setRoles(roles);

		userRepository.save(user);

	}

}
