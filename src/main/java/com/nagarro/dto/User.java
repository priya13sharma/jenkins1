package com.nagarro.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * User class is an user entity that is stored in database for login
 * functionality
 * 
 * @author priyasharma
 *
 */

@Entity
@Table(name = "user")
public class User {
	@Id
	
	private String userName;
	private String password;



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [ userName=" + userName + ", password=" + password + "]";
	}
}

