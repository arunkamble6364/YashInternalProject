package com.spring;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.spring.helper.UserFoundException;
import com.spring.model.Role;
import com.spring.model.User;
import com.spring.model.UserRole;
import com.spring.service.UserService;

@SpringBootApplication
public class SpringAngularApplication {


	/*
	 * implements CommandLineRunner {
	 * 
	 * 
	 * @Autowired private UserService userService;
	 * 
	 * 
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 */

	public static void main(String[] args) {

		SpringApplication.run(SpringAngularApplication.class, args);
		System.out.println("starting code");
	}
	/*
	 * public void run(String... args) throws Exception { try {
	 * 
	 * 
	 * System.out.println("starting code");
	 * 
	 * User user = new User();
	 * 
	 * user.setFirstname("Dhiren"); user.setLasttname("Rathore");
	 * user.setUsername("dhirensingh");
	 * user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
	 * user.setEmail("dhiren@gmail.com"); user.setProfile("default.png");
	 * user.setPhone("43784399394");
	 * 
	 * Role role1 = new Role(); role1.setRoleid(44L); role1.setRoleName("ADMIN");
	 * 
	 * Set<UserRole> userRoleSet = new HashSet<>(); UserRole userRole = new
	 * UserRole();
	 * 
	 * userRole.setRole(role1);
	 * 
	 * userRole.setUser(user);
	 * 
	 * userRoleSet.add(userRole);
	 * 
	 * User user1 = this.userService.createUser(user, userRoleSet);
	 * System.out.println(user1.getUsername());
	 * 
	 * 
	 * } catch (UserFoundException e) { e.printStackTrace();
	 * 
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
	}
