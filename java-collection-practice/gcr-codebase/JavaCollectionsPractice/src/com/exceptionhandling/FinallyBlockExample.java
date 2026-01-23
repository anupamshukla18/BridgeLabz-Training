package com.exceptionhandling;

import java.util.Scanner;

public class FinallyBlockExample {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // user input

		try {
			// read numbers
			System.out.print("Enter first number: ");
			int firstNumber = input.nextInt();

			System.out.print("Enter second number: ");
			int secondNumber = input.nextInt();

			// perform division
			int result = firstNumber / secondNumber;
			System.out.println("Result: " + result);

		} catch (ArithmeticException exception) {
			// handle division by zero
			System.out.println("Cannot divide by zero");

		} finally {
			// always executed
			System.out.println("Operation completed");
		}

		input.close(); // close scanner
	}
}
