package day11.hackerrankproblems;

import java.util.Scanner;
import java.util.HashSet;

public class WeightedUniformStrings {
	public static String[] weightedUniformStrings(String s, int[] queries) {

		HashSet<Integer> possibleWeights = new HashSet<>();

		int currentWeight = 0;
		char previousCharacter = '\0';

		for (int i = 0; i < s.length(); i++) {

			char currentCharacter = s.charAt(i);

			int characterWeight = currentCharacter - 'a' + 1;

			if (currentCharacter == previousCharacter) {
				currentWeight += characterWeight;
			} else {
				currentWeight = characterWeight;
			}

			possibleWeights.add(currentWeight);

			previousCharacter = currentCharacter;
		}

		String[] answers = new String[queries.length];

		for (int i = 0; i < queries.length; i++) {

			if (possibleWeights.contains(queries[i])) {
				answers[i] = "Yes";
			} else {
				answers[i] = "No";
			}
		}

		return answers;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		int numberOfQueries = scanner.nextInt();

		int[] queries = new int[numberOfQueries];

		for (int i = 0; i < numberOfQueries; i++) {
			queries[i] = scanner.nextInt();
		}

		String[] answers = weightedUniformStrings(inputString, queries);

		for (String answer : answers) {
			System.out.println(answer);
		}

		scanner.close();
	}
}