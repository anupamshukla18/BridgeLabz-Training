package com.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {

	public static void main(String[] args) {

		// Input string
		String input = "programming";

		// Step 1: Create StringBuilder to store result
		StringBuilder sb = new StringBuilder();

		// Step 2: Create HashSet to track characters
		HashSet<Character> seen = new HashSet<>();

		// Step 3: Iterate over each character
		for (char ch : input.toCharArray()) {

			// If character not seen before, add it
			if (!seen.contains(ch)) {
				sb.append(ch);
				seen.add(ch);
			}
		}

		// Step 4: Convert StringBuilder to String
		String result = sb.toString();

		// Output
		System.out.println("Original String: " + input);
		System.out.println("String Without Duplicates: " + result);
	}
}
