package com.searching.linear;

public class SearchWordInSentences {

	public static void main(String[] args) {

		// Input array of sentences
		String[] sentences = { "Java is a powerful language", "Learning data structures is important",
				"Linear search is simple", "Practice makes perfect" };

		// Word to search
		String word = "search";

		// Call search method
		String result = findSentenceContainingWord(sentences, word);

		// Output
		System.out.println("Search Result: " + result);
	}

	// Linear search method
	public static String findSentenceContainingWord(String[] sentences, String word) {

		// Step 1: Iterate through sentences
		for (String sentence : sentences) {

			// Step 2: Check if sentence contains the word
			if (sentence.contains(word)) {
				return sentence; // Step 3: Return sentence
			}
		}

		// Step 4: If word not found
		return "Not Found";
	}
}
