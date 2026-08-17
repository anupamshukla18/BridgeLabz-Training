package day11.hackerrankproblems;

import java.util.Scanner;

public class FunnyString {
	public static String funnyString(String s) {

		String reversedString = new StringBuilder(s).reverse().toString();

		for (int i = 0; i < s.length() - 1; i++) {

			int originalDifference = Math.abs(s.charAt(i) - s.charAt(i + 1));

			int reversedDifference = Math.abs(reversedString.charAt(i) - reversedString.charAt(i + 1));

			if (originalDifference != reversedDifference) {
				return "Not Funny";
			}
		}

		return "Funny";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfQueries = scanner.nextInt();

		for (int i = 0; i < numberOfQueries; i++) {

			String inputString = scanner.next();

			System.out.println(funnyString(inputString));
		}

		scanner.close();
	}
}