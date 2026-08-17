package day11.classproblems;

import java.util.*;

public class StringCompression {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		StringBuilder compressedString = new StringBuilder();

		int characterCount = 1;

		for (int index = 0; index < inputString.length(); index++) {

			if (index < inputString.length() - 1 && inputString.charAt(index) == inputString.charAt(index + 1)) {

				characterCount++;

			} else {

				compressedString.append(inputString.charAt(index));
				compressedString.append(characterCount);

				characterCount = 1;
			}
		}

		System.out.println(compressedString);

		scanner.close();
	}
}