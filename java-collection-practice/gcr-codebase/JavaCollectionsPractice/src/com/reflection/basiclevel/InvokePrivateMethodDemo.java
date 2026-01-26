package com.reflection.basiclevel;

import java.lang.reflect.Method;

public class InvokePrivateMethodDemo {

	// Inner Calculator class
	static class Calculator {
		private int multiply(int a, int b) {
			return a * b;
		}
	}

	public static void main(String[] args) {

		try {
			// Create Calculator object
			Calculator calculator = new Calculator();

			// Get Class object
			Class<?> cls = calculator.getClass();

			// Access private method "multiply"
			Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

			// Allow access to private method
			method.setAccessible(true);

			// Invoke private method
			int result = (int) method.invoke(calculator, 5, 4);

			// Display result
			System.out.println("Result: " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
