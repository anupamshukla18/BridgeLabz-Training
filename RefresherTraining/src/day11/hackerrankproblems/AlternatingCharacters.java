package day11.hackerrankproblems;

import java.util.Scanner;

public class AlternatingCharacters {
	public static int alternatingCharacters(String s) {

		int deletionCount = 0;

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				deletionCount++;
			}
		}

		return deletionCount;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfQueries = scanner.nextInt();

		for (int i = 0; i < numberOfQueries; i++) {

			String inputString = scanner.next();

			System.out.println(alternatingCharacters(inputString));
		}

		scanner.close();
	}
}