package day11.hackerrankproblems;

import java.util.Scanner;

public class MarsExploration {
	public static int marsExploration(String s) {

		String expectedPattern = "SOS";
		int changedCharacters = 0;

		for (int i = 0; i < s.length(); i++) {

			char expectedCharacter = expectedPattern.charAt(i % 3);
			char receivedCharacter = s.charAt(i);

			if (receivedCharacter != expectedCharacter) {
				changedCharacters++;
			}
		}

		return changedCharacters;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String receivedSignal = scanner.nextLine();

		System.out.println(marsExploration(receivedSignal));

		scanner.close();
	}
}