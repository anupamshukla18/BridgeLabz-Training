package day11.hackerrankproblems;

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class FindingStrings {
	public static String findKthString(HashSet<String> allSubstrings, int k) {

		ArrayList<String> sortedSubstrings = new ArrayList<>(allSubstrings);

		Collections.sort(sortedSubstrings);

		if (k > sortedSubstrings.size()) {
			return "INVALID";
		}

		return sortedSubstrings.get(k - 1);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfStrings = scanner.nextInt();

		HashSet<String> allSubstrings = new HashSet<>();

		for (int i = 0; i < numberOfStrings; i++) {

			String currentString = scanner.next();

			for (int start = 0; start < currentString.length(); start++) {

				for (int end = start + 1; end <= currentString.length(); end++) {

					String substring = currentString.substring(start, end);

					allSubstrings.add(substring);
				}
			}
		}

		int numberOfQueries = scanner.nextInt();

		ArrayList<String> sortedSubstrings = new ArrayList<>(allSubstrings);

		Collections.sort(sortedSubstrings);

		for (int i = 0; i < numberOfQueries; i++) {

			int k = scanner.nextInt();

			if (k > sortedSubstrings.size()) {
				System.out.println("INVALID");
			} else {
				System.out.println(sortedSubstrings.get(k - 1));
			}
		}

		scanner.close();
	}
}