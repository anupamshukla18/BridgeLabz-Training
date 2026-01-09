package com.stringbuffer;

public class ConcatenateStringsUsingStringBuffer {

	public static void main(String[] args) {

		// Input array of strings
		String[] words = { "Java", " ", "is", " ", "powerful" };

		// Step 1: Create a StringBuffer object
		StringBuffer buffer = new StringBuffer();

		// Step 2: Iterate through each string and append to StringBuffer
		for (String word : words) {
			buffer.append(word);
		}

		// Step 3: Convert StringBuffer to String
		String result = buffer.toString();

		// Output
		System.out.println("Concatenated String: " + result);
	}
}
