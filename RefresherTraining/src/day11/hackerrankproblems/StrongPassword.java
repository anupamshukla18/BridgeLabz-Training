package day11.hackerrankproblems;

import java.util.Scanner;

public class StrongPassword {
	public static int minimumNumber(int n, String password) {
		boolean hasDigit = false;
		boolean hasLowercase = false;
		boolean hasUppercase = false;
		boolean hasSpecial = false;

		String specialCharacters = "!@#$%^&*()-+";

		for (int i = 0; i < password.length(); i++) {

			char currentCharacter = password.charAt(i);

			if (Character.isDigit(currentCharacter)) {
				hasDigit = true;
			} else if (Character.isLowerCase(currentCharacter)) {
				hasLowercase = true;
			} else if (Character.isUpperCase(currentCharacter)) {
				hasUppercase = true;
			} else if (specialCharacters.indexOf(currentCharacter) != -1) {
				hasSpecial = true;
			}
		}

		int charactersToAdd = 0;

		if (!hasDigit) {
			charactersToAdd++;
		}

		if (!hasLowercase) {
			charactersToAdd++;
		}

		if (!hasUppercase) {
			charactersToAdd++;
		}

		if (!hasSpecial) {
			charactersToAdd++;
		}

		return Math.max(charactersToAdd, 6 - n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int passwordLength = scanner.nextInt();
		String password = scanner.next();

		System.out.println(minimumNumber(passwordLength, password));

		scanner.close();
	}
}