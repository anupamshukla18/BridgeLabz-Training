package com.personalizedlearningplatform;

public class User {
	// Instance variables
	protected int userId;
	protected String name;
	protected String email;

	// Constructor
	public User(int userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}

	public void getDetails() {
		System.out.println("User ID : " + userId);
		System.out.println("Name    : " + name);
		System.out.println("Email   : " + email);
	}
}
