package day11.hackerrankproblems;

import java.util.Scanner;

public class LoveLetterMystery {
	public static int theLoveLetterMystery(String s) {

		int minimumOperations = 0;

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			minimumOperations += Math.abs(s.charAt(left) - s.charAt(right));

			left++;
			right--;
		}

		return minimumOperations;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfQueries = scanner.nextInt();

		for (int i = 0; i < numberOfQueries; i++) {

			String inputString = scanner.next();

			System.out.println(theLoveLetterMystery(inputString));
		}

		scanner.close();
	}
}