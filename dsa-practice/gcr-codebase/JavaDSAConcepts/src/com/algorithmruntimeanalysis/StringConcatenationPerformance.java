package com.algorithmruntimeanalysis;

import java.util.Scanner;

public class StringConcatenationPerformance {

	// String Concatenation Time Complexity: O(N^2)
	public static void concatenateUsingString(int operationsCount) {

		String result = "";

		for (int i = 0; i < operationsCount; i++) {
			result = result + "a";
		}
	}

	// StringBuilder Concatenation Time Complexity: O(N)
	public static void concatenateUsingStringBuilder(int operationsCount) {

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < operationsCount; i++) {
			stringBuilder.append("a");
		}
	}

	// StringBuffer Concatenation Time Complexity: O(N)
	public static void concatenateUsingStringBuffer(int operationsCount) {

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < operationsCount; i++) {
			stringBuffer.append("a");
		}
	}

	// Main Method
	public static void main(String[] args) {

		// create Scanner object
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of concatenation operations: ");
		int operationsCount = input.nextInt();

		// String Timing
		long stringStartTime = System.nanoTime();
		concatenateUsingString(operationsCount);
		long stringEndTime = System.nanoTime();

		// StringBuilder Timing
		long stringBuilderStartTime = System.nanoTime();
		concatenateUsingStringBuilder(operationsCount);
		long stringBuilderEndTime = System.nanoTime();

		// StringBuffer Timing
		long stringBufferStartTime = System.nanoTime();
		concatenateUsingStringBuffer(operationsCount);
		long stringBufferEndTime = System.nanoTime();

		// Output
		System.out.println("\n--- String Concatenation Performance ---");
		System.out.println("String Time        : " + (stringEndTime - stringStartTime) + " ns");
		System.out.println("StringBuilder Time : " + (stringBuilderEndTime - stringBuilderStartTime) + " ns");
		System.out.println("StringBuffer Time  : " + (stringBufferEndTime - stringBufferStartTime) + " ns");

		input.close(); // closing input stream
	}
}
