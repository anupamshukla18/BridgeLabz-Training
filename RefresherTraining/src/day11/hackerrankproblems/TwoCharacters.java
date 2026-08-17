package day11.hackerrankproblems;

import java.util.Scanner;

public class TwoCharacters {
	public static int alternate(String s) {

		int maximumLength = 0;

		// Try every pair of lowercase characters
		for (char firstCharacter = 'a'; firstCharacter <= 'z'; firstCharacter++) {
			for (char secondCharacter = (char) (firstCharacter + 1); secondCharacter <= 'z'; secondCharacter++) {

				StringBuilder alternateString = new StringBuilder();

				// Keep only the selected two characters
				for (int i = 0; i < s.length(); i++) {

					char currentCharacter = s.charAt(i);

					if (currentCharacter == firstCharacter || currentCharacter == secondCharacter) {

						alternateString.append(currentCharacter);
					}
				}

				// Check whether characters alternate
				boolean isValid = true;

				for (int i = 1; i < alternateString.length(); i++) {

					if (alternateString.charAt(i) == alternateString.charAt(i - 1)) {

						isValid = false;
						break;
					}
				}

				if (isValid) {
					maximumLength = Math.max(maximumLength, alternateString.length());
				}
			}
		}

		return maximumLength;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		String inputString = scanner.next();

		System.out.println(alternate(inputString));

		scanner.close();
	}
}