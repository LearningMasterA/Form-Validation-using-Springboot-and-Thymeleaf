package com.practice.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class loginData {
	@NotBlank(message="User name cannot be empty")
	@Size(min=3,max=12,message="Username must be between 3-12 characters")
	private String userName;
	
//	@NotBlank(message="email cannot be empty")
	@Email(regexp ="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$",message="invalid email !! " )
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
