package day11.classproblems;

import java.util.*;

public class AnagramCheck {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String firstString = scanner.nextLine();
		String secondString = scanner.nextLine();

		if (firstString.length() != secondString.length()) {
			System.out.println("Not Anagram");
			return;
		}

		int[] characterFrequency = new int[26];

		for (int index = 0; index < firstString.length(); index++) {

			characterFrequency[firstString.charAt(index) - 'a']++;
			characterFrequency[secondString.charAt(index) - 'a']--;
		}

		boolean isAnagram = true;

		for (int frequency : characterFrequency) {

			if (frequency != 0) {
				isAnagram = false;
				break;
			}
		}

		if (isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

		scanner.close();
	}
}