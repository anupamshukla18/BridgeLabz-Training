package day11.hackerrankproblems;

import java.util.*;

public class AppendAndDelete {

	public static String appendAndDelete(String s, String t, int k) {

		// Find the common prefix
		int common = 0;

		while (common < s.length() && common < t.length() && s.charAt(common) == t.charAt(common)) {
			common++;
		}

		// Minimum operations required
		int operations = (s.length() - common) + (t.length() - common);

		// Case 1: We can use exactly the required operations
		if (operations <= k) {

			// Extra operations can be done by deleting characters
			// from an empty string and adding them back.
			if ((k - operations) % 2 == 0) {
				return "Yes";
			}

			// If k is enough to delete the entire original string,
			// we can use extra operations even when parity is odd.
			if (k >= s.length() + t.length()) {
				return "Yes";
			}
		}

		return "No";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String t = sc.nextLine();
		int k = sc.nextInt();

		String result = appendAndDelete(s, t, k);

		System.out.println(result);

		sc.close();
	}
}