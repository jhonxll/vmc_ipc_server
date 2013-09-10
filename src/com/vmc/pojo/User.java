package com.vmc.pojo;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String name, String password) {
		super(name, password);
	}

	/** full constructor */
	public User(String name, String password, Integer lastLogin, String email) {
		super(name, password, lastLogin, email);
	}
	
	public String toString(){
		return "user info \n"+
				"id="+getId()+"\n"+
				"name="+getName()+"\n"+
				"password="+getPassword()+"\n"+
				"email="+getEmail()+"\n";
	}
}
