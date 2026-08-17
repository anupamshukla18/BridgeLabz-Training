package day11.classproblems;

import java.util.*;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String sentence = scanner.nextLine();

		String[] words = sentence.split("\\s+");

		HashMap<String, Integer> wordFrequency = new HashMap<>();

		for (String word : words) {

			wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {

			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		scanner.close();
	}
}