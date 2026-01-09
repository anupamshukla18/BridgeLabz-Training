package com.algorithmruntimeanalysis;

import java.util.Scanner;

public class FibonacciPerformanceComparison {

	// Recursive Fibonacci method
	// Time Complexity: O(2^N)
	public static int fibonacciRecursive(int number) {

		// Base condition
		if (number <= 1) {
			return number;
		}

		// Recursive calls
		return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
	}

	// Iterative Fibonacci method
	// Time Complexity: O(N)
	public static int fibonacciIterative(int number) {

		// Base condition
		if (number <= 1) {
			return number;
		}

		int first = 0;
		int second = 1;
		int sum = 0;

		// Loop to calculate Fibonacci number
		for (int i = 2; i <= number; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}

		return second;
	}

	// Main method
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Taking input from user
		System.out.print("Enter Fibonacci number (N): ");
		int number = input.nextInt();

		// Calculating Fibonacci using recursion
		long recursiveStartTime = System.nanoTime();
		int recursiveResult = fibonacciRecursive(number);
		long recursiveEndTime = System.nanoTime();

		// Calculating Fibonacci using iteration
		long iterativeStartTime = System.nanoTime();
		int iterativeResult = fibonacciIterative(number);
		long iterativeEndTime = System.nanoTime();

		// Displaying results
		System.out.println("\nFibonacci Results");
		System.out.println("Recursive Result : " + recursiveResult);
		System.out.println("Recursive Time   : " + (recursiveEndTime - recursiveStartTime) + " ns");

		System.out.println("Iterative Result : " + iterativeResult);
		System.out.println("Iterative Time   : " + (iterativeEndTime - iterativeStartTime) + " ns");

		input.close();
	}
}
