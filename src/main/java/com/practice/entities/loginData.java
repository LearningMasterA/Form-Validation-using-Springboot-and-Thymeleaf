package com.practice.entities;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class loginData {
	@NotBlank(message="User name cannot be empty")
	@Min
	private String userName;
	@NotBlank(message="email cannot be empty")
	private String email;
	/**
	 * 
	 */
	public loginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public loginData(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "loginData [userName=" + userName + ", email=" + email + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
