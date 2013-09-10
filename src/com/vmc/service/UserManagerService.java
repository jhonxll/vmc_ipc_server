package com.vmc.service;

import java.util.List;

import com.vmc.pojo.User;
import com.vmc.pojo.UserDAO;

public class UserManagerService {

	private UserDAO userDao;

	public UserManagerService(){
		
	}
	
	public boolean addUser(User user){
		try{
			userDao.save(user);
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<User> searchUser(String name){
		List<User> users;
		try{
			users = userDao.findByName(name);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return users;
	}
	
	public boolean updateUser(User user){
		try{
			userDao.save(user);
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public void login(String name,String password){
		
	}
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
}
