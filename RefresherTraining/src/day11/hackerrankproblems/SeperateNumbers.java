package day11.hackerrankproblems;

import java.util.Scanner;
import java.math.BigInteger;

public class SeperateNumbers {
	public static void separateNumbers(String s) {

		// A beautiful number must contain at least two numbers
		if (s.length() < 2 || s.charAt(0) == '0') {
			System.out.println("NO");
			return;
		}

		// Try every possible length of the first number
		for (int firstLength = 1; firstLength <= s.length() / 2; firstLength++) {

			String firstNumber = s.substring(0, firstLength);

			BigInteger previousNumber = new BigInteger(firstNumber);

			int currentPosition = firstLength;

			while (currentPosition < s.length()) {

				BigInteger nextNumber = previousNumber.add(BigInteger.ONE);

				String nextNumberString = nextNumber.toString();

				if (s.startsWith(nextNumberString, currentPosition)) {

					currentPosition += nextNumberString.length();
					previousNumber = nextNumber;

				} else {
					break;
				}
			}

			// Entire string was successfully consumed
			if (currentPosition == s.length()) {

				System.out.println("YES " + firstNumber);
				return;
			}
		}

		System.out.println("NO");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfQueries = scanner.nextInt();

		for (int i = 0; i < numberOfQueries; i++) {

			String inputString = scanner.next();

			separateNumbers(inputString);
		}

		scanner.close();
	}
}