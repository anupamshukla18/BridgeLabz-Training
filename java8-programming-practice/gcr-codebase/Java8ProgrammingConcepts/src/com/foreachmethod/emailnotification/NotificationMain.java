package com.foreachmethod.emailnotification;

import java.util.*;

public class NotificationMain {

	public static void main(String[] args) {

		List<String> emails = Arrays.asList("anuj@gmail.com", "rohit@gmail.com", "priya@gmail.com", "neha@gmail.com");

		EmailService emailService = new EmailService();

		// Using forEach() with lambda
		emails.forEach(email -> emailService.sendEmailNotification(email));
	}
}
