package day11.hackerrankproblems;

import java.util.Scanner;

public class SimilarStrings {
	public static boolean areSimilar(String firstString, String secondString) {

		int length = firstString.length();

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {

				boolean firstSame = firstString.charAt(i) == firstString.charAt(j);

				boolean secondSame = secondString.charAt(i) == secondString.charAt(j);

				if (firstSame != secondSame) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int numberOfQueries = scanner.nextInt();

		String inputString = scanner.next();

		for (int query = 0; query < numberOfQueries; query++) {

			int left = scanner.nextInt();
			int right = scanner.nextInt();

			int substringLength = right - left + 1;

			String targetSubstring = inputString.substring(left - 1, right);

			int similarCount = 0;

			for (int start = 0; start <= n - substringLength; start++) {

				String currentSubstring = inputString.substring(start, start + substringLength);

				if (areSimilar(targetSubstring, currentSubstring)) {
					similarCount++;
				}
			}

			System.out.println(similarCount);
		}

		scanner.close();
	}
}