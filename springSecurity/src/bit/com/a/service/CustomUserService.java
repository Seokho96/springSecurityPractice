package bit.com.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import bit.com.a.dao.CustomUserDao;
import bit.com.a.model.CustomUserDetails;


public class CustomUserService implements UserDetailsService {

	@Autowired
	CustomUserDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("CustomUserService loadUserByUsername");
		
		CustomUserDetails user =  dao.getUserById(username);
		if(user == null) {
			throw new UsernameNotFoundException(username);
		}		
		return user;
	}
	
	

}
