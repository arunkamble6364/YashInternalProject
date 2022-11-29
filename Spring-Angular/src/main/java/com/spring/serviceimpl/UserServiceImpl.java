package com.spring.serviceimpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.User;
import com.spring.model.UserRole;
import com.spring.repo.RoleRepository;
import com.spring.repo.UserRepository;
import com.spring.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepository userrepository;
	@Autowired
	private RoleRepository rolerepository;
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		User local =this.userrepository.findByUsername(user.getUsername());
		
		if(local!=null)
		{
			System.out.println("User alraedy there");
			throw new Exception("User alreday there!!");
			
		}
		else {
			
			
			//user create
			
			for(UserRole ur:userRoles) {
				rolerepository.save(ur.getRole());
				
			}
			
			user.getUserRoles().addAll(userRoles);
			local=this.userrepository.save(user);
		
		}
		return local;
	}
	@Override
	public User getUser(String username) {
		return this.userrepository.findByUsername(username);
	}
	 @Override
	    public void deleteUser(Long userId) {
	        this.userrepository.deleteById(userId);
	    }

}
