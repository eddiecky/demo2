package com.polarbear.auth.service;

import java.util.Arrays;
import java.util.List;

import com.polarbear.auth.PasswordGenerator;
import com.polarbear.auth.model.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;





@Component(value = "userDetailService")
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@SuppressWarnings("unchecked")
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = new User();
		user.setId(1L);
		user.setUsername("nobody");
		user.setPassword(PasswordGenerator.get("abcd1234"));
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
	}

	@SuppressWarnings("rawtypes")
	private List getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}
}
