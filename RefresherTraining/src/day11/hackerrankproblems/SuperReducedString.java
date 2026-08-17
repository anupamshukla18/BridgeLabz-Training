package day11.hackerrankproblems;

import java.util.Scanner;

public class SuperReducedString {
	public static String superReducedString(String s) {
		StringBuilder reducedString = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			char currentCharacter = s.charAt(i);

			if (reducedString.length() > 0 && reducedString.charAt(reducedString.length() - 1) == currentCharacter) {

				reducedString.deleteCharAt(reducedString.length() - 1);

			} else {
				reducedString.append(currentCharacter);
			}
		}

		if (reducedString.length() == 0) {
			return "Empty String";
		}

		return reducedString.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		System.out.println(superReducedString(inputString));

		scanner.close();
	}
}