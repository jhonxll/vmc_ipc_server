package com.vmc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.vmc.pojo.User;
import com.vmc.service.UserManagerService;
import com.vmc.util.Log;

public class UserController extends MultiActionController {

	private UserManagerService userService;
	private static final String TAG = "UserController";
	
	public void setUserService(UserManagerService userService) {
		this.userService = userService;
	}

	public ModelAndView addUser(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Log.d(TAG,"UserController.addUser");
		User user = new User();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		if("done".equalsIgnoreCase(registeVerificate(name, password, email))){
			userService.addUser(user);
		}
		return null;
	}
	
	public ModelAndView searchUser(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Log.d(TAG,"UserController.searchUser");
		String name = request.getParameter("name");

		return null;
	}
	
	public ModelAndView updateUser(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Log.d(TAG,"UserController.updateUser");
		return null;
	}
	
	public ModelAndView userLogin(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Log.d(TAG,"UserController.userLogin");
		return null;
	}
	
	public String registeVerificate(String name,String password,String email){
		if(name == null){
			return "The name could not be null!";
		}
		if(password == null){
			return "The password could not be null!";
		}
		List<User> users = userService.searchUser(name);
		if(users != null && users.size()>0){
			return "The name has been registed!";
		}
		return "done";
	}
}
