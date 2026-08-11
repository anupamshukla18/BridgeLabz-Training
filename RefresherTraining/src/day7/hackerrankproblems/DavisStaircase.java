package day7.hackerrankproblems;

import java.util.*;

public class DavisStaircase {
	static long[] memo;

	public static int stepPerms(int n) {
		memo = new long[n + 1];
		Arrays.fill(memo, -1);

		return (int) solve(n);
	}

	static long solve(int n) {
		// Base cases
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;

		// Already calculated
		if (memo[n] != -1)
			return memo[n];

		// Take 1, 2, or 3 steps
		return memo[n] = solve(n - 1) + solve(n - 2) + solve(n - 3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of steps: ");
		int n = sc.nextInt();

		int result = stepPerms(n);

		System.out.println("Number of ways: " + result);

		sc.close();
	}
}