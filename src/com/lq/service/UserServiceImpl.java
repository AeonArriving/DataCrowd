package com.lq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.dao.UserDao;
import com.lq.entity.SjxqYhgl;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public SjxqYhgl findByName(String name) {
		return userDao.findByName(name);
	}

	@Override
	public boolean add(SjxqYhgl user) {
		userDao.add(user);
		return true;
	}

}
