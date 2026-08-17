package day11.hackerrankproblems;

import java.util.*;

public class HappyLadybugs {
	public static String happyLadybugs(String b) {

		int[] count = new int[26];
		boolean hasEmpty = false;

		// Count ladybugs and check for empty cells
		for (int i = 0; i < b.length(); i++) {

			char ch = b.charAt(i);

			if (ch == '_') {
				hasEmpty = true;
			} else {
				count[ch - 'A']++;
			}
		}

		// If empty cells exist,
		// every color must have at least 2 ladybugs
		if (hasEmpty) {

			for (int i = 0; i < 26; i++) {

				if (count[i] == 1) {
					return "NO";
				}
			}

			return "YES";
		}

		// No empty cells:
		// check whether every ladybug is already happy
		for (int i = 0; i < b.length(); i++) {

			boolean happy = false;

			if (i > 0 && b.charAt(i) == b.charAt(i - 1)) {
				happy = true;
			}

			if (i < b.length() - 1 && b.charAt(i) == b.charAt(i + 1)) {
				happy = true;
			}

			if (!happy) {
				return "NO";
			}
		}

		return "YES";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();

		while (testCases-- > 0) {

			int n = sc.nextInt();
			String b = sc.next();

			String result = happyLadybugs(b);

			System.out.println(result);
		}

		sc.close();
	}
}