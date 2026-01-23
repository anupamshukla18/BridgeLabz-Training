package com.junittesting.userregistration;

import static org.junit.Assert.*;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testValidRegistration() {
		UserRegistration registration = new UserRegistration();
		registration.registerUser("vikash", "vikash@mail.com", "Pass1234");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidRegistration() {
		UserRegistration registration = new UserRegistration();
		registration.registerUser("", "mail@test.com", "Pass1234");
	}
}
