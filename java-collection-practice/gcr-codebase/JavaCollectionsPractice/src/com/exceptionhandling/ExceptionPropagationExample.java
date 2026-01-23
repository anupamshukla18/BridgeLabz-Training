package com.exceptionhandling;

public class ExceptionPropagationExample {

	// generates exception
	public static void methodOne() {
		int result = 10 / 0;
	}

	// passes exception to caller
	public static void methodTwo() {
		methodOne();
	}

	public static void main(String[] args) {

		try {
			methodTwo();
		} catch (ArithmeticException exception) {
			// handle exception here
			System.out.println("Handled exception in main");
		}
	}
}
