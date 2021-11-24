package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.UserDao;
import com.nagarro.dto.User;

public class UserService {
	@Autowired
	private UserDao userDao;

	public boolean validateUser(String userName, String password) {
		User user = userDao.getUser(userName);
		return user != null && user.getPassword().equals(password);
	}

}
