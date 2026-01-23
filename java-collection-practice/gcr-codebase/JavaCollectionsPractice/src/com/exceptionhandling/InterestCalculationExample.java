package com.exceptionhandling;

public class InterestCalculationExample {

	// calculate interest
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Invalid input");
		}

		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {

		try {
			double interest = calculateInterest(10000, 5, 2);
			System.out.println("Calculated interest: " + interest);

		} catch (IllegalArgumentException exception) {
			// handle propagated exception
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}
}
