package com.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatchExample {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // user input

		int[] numbers = { 10, 20, 30, 40, 50 };

		try {
			// read index
			System.out.print("Enter index: ");
			int index = input.nextInt();

			try {
				// read divisor
				System.out.print("Enter divisor: ");
				int divisor = input.nextInt();

				int result = numbers[index] / divisor;
				System.out.println("Result: " + result);

			} catch (ArithmeticException exception) {
				// handle division by zero
				System.out.println("Cannot divide by zero!");
			}

		} catch (ArrayIndexOutOfBoundsException exception) {
			// handle invalid index
			System.out.println("Invalid array index!");
		}

		input.close(); // close scanner
	}
}
