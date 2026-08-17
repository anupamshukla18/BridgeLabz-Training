package day11.hackerrankproblems;

import java.util.Scanner;

public class CircularPalindromes {
	public static int longestPalindrome(String s) {

		int maximumLength = 1;

		for (int center = 0; center < s.length(); center++) {

			// Odd-length palindrome
			int left = center;
			int right = center;

			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

				maximumLength = Math.max(maximumLength, right - left + 1);

				left--;
				right++;
			}

			// Even-length palindrome
			left = center;
			right = center + 1;

			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

				maximumLength = Math.max(maximumLength, right - left + 1);

				left--;
				right++;
			}
		}

		return maximumLength;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		String originalString = scanner.next();

		for (int rotation = 0; rotation < length; rotation++) {

			String rotatedString = originalString.substring(rotation) + originalString.substring(0, rotation);

			System.out.println(longestPalindrome(rotatedString));
		}

		scanner.close();
	}
}