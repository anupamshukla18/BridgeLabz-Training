package day11.hackerrankproblems;

import java.util.*;

public class KaprekarNumbers {
	public static void kaprekarNumbers(int p, int q) {

		boolean found = false;

		for (int n = p; n <= q; n++) {

			long square = (long) n * n;

			String str = String.valueOf(square);

			int digits = String.valueOf(n).length();

			// Right part must contain exactly 'digits' digits
			int split = str.length() - digits;

			String leftPart;
			String rightPart;

			if (split == 0) {
				leftPart = "0";
				rightPart = str;
			} else {
				leftPart = str.substring(0, split);
				rightPart = str.substring(split);
			}

			long left = Long.parseLong(leftPart);
			long right = Long.parseLong(rightPart);

			if (left + right == n) {
				System.out.print(n + " ");
				found = true;
			}
		}

		if (!found) {
			System.out.println("INVALID RANGE");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();

		kaprekarNumbers(p, q);

		sc.close();
	}
}