package day8.hackerrankproblems;

import java.util.*;

public class PermutationOfStrings {
	static void permute(String[] s, boolean[] used, String[] result, int index) {
		// Base case
		if (index == s.length) {
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i == result.length - 1 ? "\n" : " "));
			}
			return;
		}

		// Trying every string
		for (int i = 0; i < s.length; i++) {

			// Skipping already used
			if (used[i]) {
				continue;
			}

			// Skipping duplicate strings
			if (i > 0 && s[i].equals(s[i - 1]) && !used[i - 1]) {
				continue;
			}

			// Choose
			used[i] = true;
			result[index] = s[i];

			// Recursive call
			permute(s, used, result, index + 1);

			// Backtracking 
			used[i] = false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		// Important: sort first
		Arrays.sort(s);

		boolean[] used = new boolean[n];
		String[] result = new String[n];

		permute(s, used, result, 0);

		sc.close();
	}
}