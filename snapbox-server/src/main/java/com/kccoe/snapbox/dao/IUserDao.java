package com.kccoe.snapbox.dao;

import com.kccoe.snapbox.domain.UserDomain;

public interface IUserDao {
	
	UserDomain findByUsername(String username);
	
}
