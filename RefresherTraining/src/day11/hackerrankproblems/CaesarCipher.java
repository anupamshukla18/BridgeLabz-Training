package day11.hackerrankproblems;

import java.util.Scanner;

public class CaesarCipher {
	public static String caesarCipher(String s, int k) {

		StringBuilder encryptedString = new StringBuilder();

		k = k % 26;

		for (int i = 0; i < s.length(); i++) {

			char currentCharacter = s.charAt(i);

			if (currentCharacter >= 'a' && currentCharacter <= 'z') {

				char shiftedCharacter = (char) ('a' + (currentCharacter - 'a' + k) % 26);

				encryptedString.append(shiftedCharacter);

			} else if (currentCharacter >= 'A' && currentCharacter <= 'Z') {

				char shiftedCharacter = (char) ('A' + (currentCharacter - 'A' + k) % 26);

				encryptedString.append(shiftedCharacter);

			} else {

				encryptedString.append(currentCharacter);
			}
		}

		return encryptedString.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		String inputString = scanner.next();
		int rotationFactor = scanner.nextInt();

		System.out.println(caesarCipher(inputString, rotationFactor));

		scanner.close();
	}
}