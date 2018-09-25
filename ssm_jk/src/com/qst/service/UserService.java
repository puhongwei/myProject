package com.qst.service;

import java.util.List;

import com.qst.model.User;

public interface UserService {

	public boolean login(User user);
	
	public List<User> getUsers();
	
	public boolean userDel(Integer id);
	
	public User getUserById(Integer id);
	
	public boolean userUpdate(User user);
}
