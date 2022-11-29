package com.spring.service;

import java.util.Set;

import com.spring.model.User;
import com.spring.model.UserRole;

public interface UserService {

	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username);
	
	//delete user by id
    public void deleteUser(Long userId);
}
