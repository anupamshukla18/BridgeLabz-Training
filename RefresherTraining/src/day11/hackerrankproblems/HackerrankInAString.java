package day11.hackerrankproblems;

import java.util.Scanner;

public class HackerrankInAString {
	public static String hackerrankInString(String s) {

		String target = "hackerrank";
		int targetIndex = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == target.charAt(targetIndex)) {
				targetIndex++;
			}

			if (targetIndex == target.length()) {
				return "YES";
			}
		}

		return "NO";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfQueries = scanner.nextInt();

		for (int i = 0; i < numberOfQueries; i++) {

			String inputString = scanner.next();

			System.out.println(hackerrankInString(inputString));
		}

		scanner.close();
	}
}