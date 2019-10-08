package com.kccoe.snapbox.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kccoe.snapbox.dao.IUserDao;

@Service
public class UserService {
	
	@Autowired
	IUserDao userDao;


}
