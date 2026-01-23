package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // user input

		try {
			// read first number
			System.out.print("Enter first number: ");
			int firstNumber = input.nextInt();

			// read second number
			System.out.print("Enter second number: ");
			int secondNumber = input.nextInt();

			// perform division
			int result = firstNumber / secondNumber;
			System.out.println("Result: " + result);

		} catch (ArithmeticException | InputMismatchException exception) {
			// handle invalid input or division by zero
			System.out.println("Invalid input or division by zero");
		}

		input.close(); // close scanner
	}
}
