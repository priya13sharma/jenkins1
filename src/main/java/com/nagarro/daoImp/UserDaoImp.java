package com.nagarro.daoImp;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.Dao;
import com.nagarro.dao.UserDao;
import com.nagarro.dto.User;

public class UserDaoImp implements UserDao {
	@Autowired
	private Dao dao;

	public User getUser(String userName) {
		dao.begin();
		User user = (User) dao.getSession().get(User.class, userName);
		dao.commit();
		dao.close();
		return user;
	}
}