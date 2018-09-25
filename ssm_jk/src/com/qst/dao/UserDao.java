package com.qst.dao;

import java.util.List;

import com.qst.model.User;

public interface UserDao {

	public User login(User user);
	
	public List<User> getUsers();
	
	public int userDelete(Integer id);
	
	public User getUserById(Integer id);
	
	public int userUpdate(User user);
}
