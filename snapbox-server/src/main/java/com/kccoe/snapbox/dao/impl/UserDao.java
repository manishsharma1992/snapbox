package com.kccoe.snapbox.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.kccoe.snapbox.dao.IUserDao;
import com.kccoe.snapbox.domain.UserDomain;

@Repository
public class UserDao implements IUserDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public UserDomain findByUsername(String username) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		return mongoTemplate.findOne(query, UserDomain.class);
	}

}
