package com.exceptionhandling.customexception;

import java.util.Scanner;

public class AgeValidationExample {

	// validate age
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // user input

		try {
			System.out.print("Enter age: ");
			int age = input.nextInt();

			validateAge(age);
			System.out.println("Access granted!");

		} catch (InvalidAgeException exception) {
			// handle custom exception
			System.out.println(exception.getMessage());
		}

		input.close(); // close scanner
	}
}
