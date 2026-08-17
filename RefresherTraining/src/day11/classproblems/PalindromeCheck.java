package day11.classproblems;

import java.util.*;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		String reversedString = "";

		for (int index = inputString.length() - 1; index >= 0; index--) {
			reversedString += inputString.charAt(index);
		}

		if (inputString.equals(reversedString)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		scanner.close();
	}
}