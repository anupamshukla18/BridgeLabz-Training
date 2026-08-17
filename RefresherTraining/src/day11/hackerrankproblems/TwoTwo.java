package day11.hackerrankproblems;

import java.util.Scanner;

public class TwoTwo {

	static class TrieNode {
		TrieNode[] children = new TrieNode[10];
		boolean isPowerOfTwo;
	}

	static TrieNode root = new TrieNode();

	// Insert a number into the Trie
	static void insert(String number) {

		TrieNode current = root;

		for (int i = 0; i < number.length(); i++) {

			int digit = number.charAt(i) - '0';

			if (current.children[digit] == null) {
				current.children[digit] = new TrieNode();
			}

			current = current.children[digit];
		}

		current.isPowerOfTwo = true;
	}

	// Generate powers of 2 from 2^0 to 2^800
	static void buildTrie() {

		java.math.BigInteger power = java.math.BigInteger.ONE;
		java.math.BigInteger two = java.math.BigInteger.valueOf(2);

		for (int exponent = 0; exponent <= 800; exponent++) {

			insert(power.toString());

			power = power.multiply(two);
		}
	}

	static int countPowers(String number) {

		int count = 0;

		for (int start = 0; start < number.length(); start++) {

			// A valid power of 2 cannot start with zero
			if (number.charAt(start) == '0') {
				continue;
			}

			TrieNode current = root;

			for (int end = start; end < number.length(); end++) {

				int digit = number.charAt(end) - '0';

				if (current.children[digit] == null) {
					break;
				}

				current = current.children[digit];

				if (current.isPowerOfTwo) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		buildTrie();

		int testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {

			String number = scanner.next();

			System.out.println(countPowers(number));
		}

		scanner.close();
	}
}