package day11.hackerrankproblems;

import java.util.Scanner;
import java.util.Arrays;

public class TwoStrings {

	static final int MAX_N = 300000;
	static final int ALPHABET = 26;
	static final long LIMIT = 1_000_000_000_000_000_000L;

	static long[] sortedStates;
	static boolean[] used = new boolean[30];

	static class SuffixAutomaton {

		int[][] next;
		int[] length;
		int[] link;
		int[] grundy;

		long[] dp;
		long[] ways;
		long[] grundyCount;

		int numberOfStates;
		int last;

		SuffixAutomaton(int n) {

			int maxStates = 2 * n + 5;

			next = new int[ALPHABET][maxStates];
			length = new int[maxStates];
			link = new int[maxStates];
			grundy = new int[maxStates];

			dp = new long[maxStates];
			ways = new long[maxStates];

			grundyCount = new long[30];

			numberOfStates = 1;
			last = 1;

			length[1] = 0;
			link[1] = 0;
		}

		// Add one character to the suffix automaton
		void addCharacter(int character) {

			int current = ++numberOfStates;

			length[current] = length[last] + 1;

			int p = last;

			while (p > 0 && next[character][p] == 0) {

				next[character][p] = current;
				p = link[p];
			}

			if (p == 0) {

				link[current] = 1;

			} else {

				int q = next[character][p];

				if (length[p] + 1 == length[q]) {

					link[current] = q;

				} else {

					int clone = ++numberOfStates;

					length[clone] = length[p] + 1;
					link[clone] = link[q];

					for (int c = 0; c < ALPHABET; c++) {
						next[c][clone] = next[c][q];
					}

					while (p > 0 && next[character][p] == q) {

						next[character][p] = clone;
						p = link[p];
					}

					link[q] = clone;
					link[current] = clone;
				}
			}

			last = current;
		}

		/*
		 * Calculate Grundy number of every state.
		 *
		 * Grundy(v) = mex( Grundy(next[v][a]), Grundy(next[v][b]), ... )
		 */
		void calculateGrundy() {

			sortStatesByLength();

			for (int i = numberOfStates; i >= 1; i--) {

				int state = getStateFromSorted(i);

				Arrays.fill(used, false);

				for (int c = 0; c < ALPHABET; c++) {

					int nextState = next[c][state];

					if (nextState != 0) {
						used[grundy[nextState]] = true;
					}
				}

				for (int g = 0; g < 30; g++) {

					if (!used[g]) {
						grundy[state] = g;
						break;
					}
				}

				dp[state] = 1;
			}
		}

		/*
		 * For every state, calculate:
		 *
		 * dp[state] = number of different substrings represented by paths starting from
		 * this state.
		 *
		 * ways[state] = number of different strings represented by paths that reach
		 * this state.
		 */
		void calculateSubstringDP() {

			sortStatesByLength();

			for (int i = numberOfStates; i >= 1; i--) {

				int state = getStateFromSorted(i);

				dp[state] = 1;

				for (int c = 0; c < ALPHABET; c++) {

					int nextState = next[c][state];

					if (nextState != 0) {

						dp[state] += dp[nextState];

						if (dp[state] > LIMIT) {
							dp[state] = LIMIT;
						}
					}
				}
			}

			ways[1] = 1;

			// Increasing length order
			for (int i = 1; i <= numberOfStates; i++) {

				int state = getStateFromSorted(i);

				for (int c = 0; c < ALPHABET; c++) {

					int nextState = next[c][state];

					if (nextState != 0) {

						ways[nextState] += ways[state];

						if (ways[nextState] > LIMIT) {
							ways[nextState] = LIMIT;
						}
					}
				}
			}

			for (int state = 1; state <= numberOfStates; state++) {

				int g = grundy[state];

				grundyCount[g] += ways[state];

				if (grundyCount[g] > LIMIT) {
					grundyCount[g] = LIMIT;
				}
			}
		}

		/*
		 * Recalculate DP when only states whose Grundy number is different from
		 * badGrundy are considered valid.
		 */
		void recalculateDP(int badGrundy) {

			sortStatesByLength();

			for (int i = numberOfStates; i >= 1; i--) {

				int state = getStateFromSorted(i);

				dp[state] = (grundy[state] != badGrundy) ? 1 : 0;

				for (int c = 0; c < ALPHABET; c++) {

					int nextState = next[c][state];

					if (nextState != 0) {

						dp[state] += dp[nextState];

						if (dp[state] > LIMIT) {
							dp[state] = LIMIT;
						}
					}
				}
			}
		}

		void sortStatesByLength() {

			for (int i = 1; i <= numberOfStates; i++) {

				sortedStates[i] = ((long) length[i] << 32) | (i & 0xffffffffL);
			}

			Arrays.sort(sortedStates, 1, numberOfStates + 1);
		}

		int getStateFromSorted(int position) {

			return (int) sortedStates[position];
		}
	}

	/*
	 * Number of B substrings whose Grundy number is different from the given Grundy
	 * number.
	 */
	static long winningBCount(int grundyOfA, SuffixAutomaton b) {

		long total = b.dp[1];

		long sameGrundy = b.grundyCount[grundyOfA];

		return total - sameGrundy;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		long k = scanner.nextLong();

		String a = scanner.next();
		String b = scanner.next();

		sortedStates = new long[2 * MAX_N + 10];

		SuffixAutomaton automatonA = new SuffixAutomaton(n);

		SuffixAutomaton automatonB = new SuffixAutomaton(m);

		// Build SAM for A
		for (int i = 0; i < n; i++) {

			automatonA.addCharacter(a.charAt(i) - 'a');
		}

		// Build SAM for B
		for (int i = 0; i < m; i++) {

			automatonB.addCharacter(b.charAt(i) - 'a');
		}

		/*
		 * Calculate Grundy numbers.
		 */
		automatonA.calculateGrundy();
		automatonB.calculateGrundy();

		/*
		 * Calculate information about all substrings of B.
		 */
		automatonB.calculateSubstringDP();

		/*
		 * For every state of A:
		 *
		 * dp[state] = number of winning B substrings for the current A state + all
		 * winning continuations.
		 */
		automatonA.sortStatesByLength();

		for (int i = automatonA.numberOfStates; i >= 1; i--) {

			int state = automatonA.getStateFromSorted(i);

			automatonA.dp[state] = winningBCount(automatonA.grundy[state], automatonB);

			for (int c = 0; c < ALPHABET; c++) {

				int nextState = automatonA.next[c][state];

				if (nextState != 0) {

					automatonA.dp[state] += automatonA.dp[nextState];

					if (automatonA.dp[state] > LIMIT) {
						automatonA.dp[state] = LIMIT;
					}
				}
			}
		}

		/*
		 * Is the K-th winning position available?
		 */
		if (k > automatonA.dp[1]) {

			System.out.println("no solution");

			scanner.close();
			return;
		}

		/*
		 * Find K-th lexicographical A'.
		 */
		StringBuilder answerA = new StringBuilder();

		int currentState = 1;

		while (true) {

			long emptyChoice = winningBCount(automatonA.grundy[currentState], automatonB);

			/*
			 * Empty A' comes before every character.
			 */
			if (k <= emptyChoice) {
				break;
			}

			k -= emptyChoice;

			boolean found = false;

			/*
			 * Characters are tried from 'a' to 'z' for lexicographical order.
			 */
			for (int c = 0; c < ALPHABET; c++) {

				int nextState = automatonA.next[c][currentState];

				if (nextState == 0) {
					continue;
				}

				long count = automatonA.dp[nextState];

				if (k > count) {

					k -= count;

				} else {

					answerA.append((char) ('a' + c));

					currentState = nextState;

					found = true;
					break;
				}
			}

			if (!found) {
				break;
			}
		}

		System.out.println(answerA);

		/*
		 * Now A' is fixed.
		 *
		 * Alice wins exactly when:
		 *
		 * Grundy(A') != Grundy(B')
		 */
		int aGrundy = automatonA.grundy[currentState];

		automatonB.recalculateDP(aGrundy);

		/*
		 * Find K-th valid B'.
		 */
		StringBuilder answerB = new StringBuilder();

		currentState = 1;

		while (true) {

			/*
			 * Empty string comes before 'a'.
			 */
			if (automatonB.grundy[currentState] != aGrundy) {

				if (k == 1) {
					break;
				}

				k--;
			}

			boolean found = false;

			for (int c = 0; c < ALPHABET; c++) {

				int nextState = automatonB.next[c][currentState];

				if (nextState == 0) {
					continue;
				}

				long count = automatonB.dp[nextState];

				if (k > count) {

					k -= count;

				} else {

					answerB.append((char) ('a' + c));

					currentState = nextState;

					found = true;
					break;
				}
			}

			if (!found) {
				break;
			}
		}

		System.out.println(answerB);

		scanner.close();
	}
}