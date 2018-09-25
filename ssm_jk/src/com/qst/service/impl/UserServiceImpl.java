package com.qst.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qst.dao.UserDao;
import com.qst.model.User;
import com.qst.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	@Override
	public boolean login(User user) {
		boolean result = false;
		if(userDao.login(user)!=null){
			result = true;
		}
		
		return result;
	}

	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	@Override
	public boolean userDel(Integer id) {
		if(userDao.userDelete(id)>0){
			return true;
		}
		
		return false;
	}

	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

	@Override
	@Transactional
	public boolean userUpdate(User user) {
		if(userDao.userUpdate(user)>0){
			return true;
		}
		return false;
	}

}
