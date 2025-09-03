package com.practice.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class loginData {
	@NotBlank(message="User name cannot be empty")
	@Size(min=3,max=12,message="Username must be between 3-12 characters")
	private String userName;
	
	@NotBlank(message="email cannot be empty")
	@Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")
	private String email;
	
	@AssertTrue(message="must agree terms and conditions!!")
	private boolean agreed;
	/**
	 * @param userName
	 * @param email
	 * @param agreed
	 */
	public loginData(
			@NotBlank(message = "User name cannot be empty") @Size(min = 3, max = 12, message = "Username must be between 3-12 characters") String userName,
			@Email(regexp  = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$", message = "invalid email !! ") String email,
			@AssertTrue boolean agreed) {
		super();
		this.userName = userName;
		this.email = email;
		this.agreed = agreed;
	}
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	/**
	 * 
	 */
	public loginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "loginData [userName=" + userName + ", email=" + email + ", agreed=" + agreed + "]";
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
