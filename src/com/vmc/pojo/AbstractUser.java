package com.vmc.pojo;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String password;
	private Integer lastLogin;
	private String email;

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(String name, String password) {
		this.name = name;
		this.password = password;
	}

	/** full constructor */
	public AbstractUser(String name, String password, Integer lastLogin,
			String email) {
		this.name = name;
		this.password = password;
		this.lastLogin = lastLogin;
		this.email = email;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Integer lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}