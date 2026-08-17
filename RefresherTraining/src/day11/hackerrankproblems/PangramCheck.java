package day11.hackerrankproblems;

import java.util.Scanner;

public class PangramCheck {
	public static String pangrams(String s) {

		boolean[] letterPresent = new boolean[26];

		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {

			char currentCharacter = s.charAt(i);

			if (currentCharacter >= 'a' && currentCharacter <= 'z') {

				int index = currentCharacter - 'a';

				letterPresent[index] = true;
			}
		}

		for (int i = 0; i < 26; i++) {

			if (!letterPresent[i]) {
				return "not pangram";
			}
		}

		return "pangram";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		System.out.println(pangrams(inputString));

		scanner.close();
	}
}