package day11.hackerrankproblems;

import java.util.*;

public class RepeatedStrings {

	public static long repeatedString(String s, long n) {

		// Count 'a' in the original string
		long countA = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				countA++;
			}
		}

		// Number of complete repetitions
		long complete = n / s.length();

		// Remaining characters
		long remaining = n % s.length();

		// 'a' count in the remaining part
		long remainingA = 0;

		for (int i = 0; i < remaining; i++) {
			if (s.charAt(i) == 'a') {
				remainingA++;
			}
		}

		return (complete * countA) + remainingA;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		long n = sc.nextLong();

		long result = repeatedString(s, n);

		System.out.println(result);

		sc.close();
	}
}