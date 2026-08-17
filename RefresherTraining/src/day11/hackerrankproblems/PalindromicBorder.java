package day11.hackerrankproblems;

import java.util.Scanner;

public class PalindromicBorder {
	static final long MOD = 1_000_000_007L;

	static class Node {

		int length;
		int suffixLink;
		int count;
		int[] next = new int[26];

		Node(int length) {
			this.length = length;
		}
	}

	static String inputString;
	static Node[] tree;
	static int nodeCount;

	// Finds the longest palindromic suffix that can
	// be extended by the current character.
	static int getSuffix(int position, int node) {

		while (position - 1 - tree[node].length < 0
				|| inputString.charAt(position - 1 - tree[node].length) != inputString.charAt(position)) {

			node = tree[node].suffixLink;
		}

		return node;
	}

	static long palindromicBorder(String s) {

		inputString = s;

		int n = s.length();

		tree = new Node[n + 2];

		// Root for odd length palindromes
		tree[0] = new Node(-1);
		tree[0].suffixLink = 0;

		// Root for even length palindromes
		tree[1] = new Node(0);
		tree[1].suffixLink = 0;

		nodeCount = 2;

		int currentNode = 1;

		for (int position = 0; position < n; position++) {

			int character = s.charAt(position) - 'a';

			currentNode = getSuffix(position, currentNode);

			// If this palindrome does not exist yet
			if (tree[currentNode].next[character] == 0) {

				int newNode = nodeCount++;

				tree[newNode] = new Node(tree[currentNode].length + 2);

				int suffixCandidate = getSuffix(position, tree[currentNode].suffixLink);

				tree[newNode].suffixLink = tree[suffixCandidate].next[character];

				// A palindrome of length 1 has the
				// empty palindrome as its suffix link.
				if (tree[newNode].suffixLink == 0) {
					tree[newNode].suffixLink = 1;
				}

				tree[currentNode].next[character] = newNode;
			}

			currentNode = tree[currentNode].next[character];

			// One occurrence of this palindrome
			tree[currentNode].count++;
		}

		/*
		 * Propagate occurrence counts through suffix links.
		 *
		 * If palindrome P occurs as a suffix of palindrome Q, every occurrence of Q is
		 * also an occurrence of P.
		 */
		for (int i = nodeCount - 1; i >= 2; i--) {

			int parent = tree[i].suffixLink;

			tree[parent].count += tree[i].count;
		}

		long answer = 0;

		/*
		 * If a palindrome occurs c times, choose any two different occurrences:
		 *
		 * cC2 = c * (c - 1) / 2
		 *
		 * Each pair represents one substring whose prefix and suffix are that
		 * palindrome.
		 */
		for (int i = 2; i < nodeCount; i++) {

			long count = tree[i].count;

			answer += count * (count - 1) / 2;

			answer %= MOD;
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.next();

		System.out.println(palindromicBorder(inputString));

		scanner.close();
	}
}