package day8.hackerrankproblems;

import java.util.*;

public class CoinChange {
	static long getWays(int n, List<Long> coins) {
		return solve(n, coins, 0);
	}

	static long solve(int amount, List<Long> coins, int index) {
		// Amount completely formed
		if (amount == 0) {
			return 1;
		}

		// No coins left
		if (index == coins.size()) {
			return 0;
		}

		long coin = coins.get(index);

		// Coin is greater than remaining amount
		if (coin > amount) {
			return solve(amount, coins, index + 1);
		}

		// Take the coin OR don't take the coin
		return solve((int) (amount - coin), coins, index) + solve(amount, coins, index + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter amount: ");
		int n = sc.nextInt();

		System.out.print("Enter number of coins: ");
		int m = sc.nextInt();

		List<Long> coins = new ArrayList<>();

		System.out.println("Enter coin denominations:");

		for (int i = 0; i < m; i++) {
			coins.add(sc.nextLong());
		}

		long result = getWays(n, coins);

		System.out.println("Number of ways: " + result);

		sc.close();
	}
}