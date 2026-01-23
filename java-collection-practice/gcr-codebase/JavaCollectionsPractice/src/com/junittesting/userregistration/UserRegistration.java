package com.junittesting.userregistration;

public class UserRegistration {

	public void registerUser(String username, String email, String password) {

		if (username == null || username.isBlank() || email == null || email.isBlank() || password == null
				|| password.isBlank()) {

			throw new IllegalArgumentException("Invalid user details");
		}
	}
}
