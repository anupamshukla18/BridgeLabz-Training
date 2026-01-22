package com.collections.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String input = "Hello world, hello Java!";

		HashMap<String, Integer> map = new HashMap<>();

		// 1. Convert to lowercase
		input = input.toLowerCase();

		// 2. Remove punctuation
		input = input.replaceAll("[^a-z0-9 ]", "");

		// 3. Split into words
		String[] words = input.split("\\s+");

		// 4. Count word frequency
		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			if (word.length() == 0)
				continue;

			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		// 5. Print result
		System.out.println(map);
	}
}
