package com.exceptionhandling;

import java.util.Scanner;

public class ArrayAccessExample {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // user input

		try {
			// initialize array
			int[] numbers = { 10, 20, 30, 40, 50 };

			// read index
			System.out.print("Enter index: ");
			int index = input.nextInt();

			// access array element
			System.out.println("Value at index " + index + ": " + numbers[index]);

		} catch (ArrayIndexOutOfBoundsException exception) {
			// handle invalid index
			System.out.println("Invalid index!");

		} catch (NullPointerException exception) {
			// handle null array
			System.out.println("Array is not initialized!");
		}

		input.close(); // close scanner
	}
}
