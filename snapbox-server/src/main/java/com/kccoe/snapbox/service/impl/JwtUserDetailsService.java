package com.kccoe.snapbox.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.kccoe.snapbox.dao.impl.UserDao;
import com.kccoe.snapbox.domain.UserDomain;
import com.kccoe.snapbox.service.IJwtUserDetailsService;



@Service
public class JwtUserDetailsService implements IJwtUserDetailsService, UserDetailsService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDomain userDomain = userDao.findByUsername(username);
		User user = new User(userDomain.getUsername(), userDomain.getPassword(), Lists.newArrayList());
		return user;
	}
}
