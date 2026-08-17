package day11.hackerrankproblems;

import java.util.*;

public class HowManyStrings {

	static class FenwickTree {

		long[] tree1;
		long[] tree2;

		FenwickTree(int n) {
			tree1 = new long[n + 2];
			tree2 = new long[n + 2];
		}

		void add(long[] tree, int index, long value) {
			for (int i = index; i < tree.length; i += i & -i) {
				tree[i] += value;
			}
		}

		void rangeAdd(int left, int right, long value) {
			if (left > right) {
				return;
			}

			add(tree1, left, value);
			add(tree1, right + 1, -value);

			add(tree2, left, value * (left - 1));
			add(tree2, right + 1, -value * right);
		}

		long prefixSum(long[] tree, int index) {
			long result = 0;

			for (int i = index; i > 0; i -= i & -i) {
				result += tree[i];
			}

			return result;
		}

		long query(int index) {
			long a = prefixSum(tree1, index);
			long b = prefixSum(tree2, index);

			return a * index - b;
		}
	}

	static class SegmentTree {

		int size;
		int[] value;

		SegmentTree(int n) {
			size = 1;

			while (size < n) {
				size <<= 1;
			}

			value = new int[size << 1];

			Arrays.fill(value, -1);
		}

		void update(int left, int right, int newValue) {
			update(left, right, newValue, 0, size, 1);
		}

		void update(int left, int right, int newValue, int start, int end, int node) {

			if (left <= start && end <= right) {
				value[node] = newValue;
				return;
			}

			if (value[node] != -1) {

				value[node * 2] = value[node];

				value[node * 2 + 1] = value[node];

				value[node] = -1;
			}

			int mid = (start + end) / 2;

			if (left < mid) {
				update(left, right, newValue, start, mid, node * 2);
			}

			if (right > mid) {
				update(left, right, newValue, mid, end, node * 2 + 1);
			}
		}

		int get(int index) {

			int result = -1;

			for (int node = size + index; node >= 1; node >>= 1) {

				if (value[node] != -1) {
					result = value[node];
				}
			}

			return result;
		}
	}

	static class SuffixAutomaton {

		static class State {

			int length;
			int link;

			int[] next = new int[26];

			State() {
				Arrays.fill(next, -1);
			}
		}

		State[] states;
		int size;
		int last;

		SuffixAutomaton(int n) {

			states = new State[2 * n];

			for (int i = 0; i < states.length; i++) {
				states[i] = new State();
			}

			size = 1;
			last = 0;

			states[0].link = -1;
		}

		int extend(int character) {

			int current = size++;

			states[current].length = states[last].length + 1;

			int p = last;

			while (p != -1 && states[p].next[character] == -1) {

				states[p].next[character] = current;

				p = states[p].link;
			}

			if (p == -1) {

				states[current].link = 0;

			} else {

				int q = states[p].next[character];

				if (states[p].length + 1 == states[q].length) {

					states[current].link = q;

				} else {

					int clone = size++;

					states[clone].length = states[p].length + 1;

					states[clone].link = states[q].link;

					states[clone].next = states[q].next.clone();

					while (p != -1 && states[p].next[character] == q) {

						states[p].next[character] = clone;

						p = states[p].link;
					}

					states[q].link = clone;

					states[current].link = clone;
				}
			}

			last = current;

			return current;
		}
	}

	/*
	 * The following Link-Cut Tree maintains the suffix-link tree of the suffix
	 * automaton.
	 */
	static class LinkCutTree {

		static class Node {

			Node left;
			Node right;
			Node parent;

			int lastPosition;

			boolean reverse;

			Node() {
				lastPosition = 0;
			}
		}

		Node[] nodes;

		LinkCutTree(int n) {

			nodes = new Node[n];

			for (int i = 0; i < n; i++) {
				nodes[i] = new Node();
			}
		}

		boolean isRoot(Node node) {

			if (node.parent == null) {
				return true;
			}

			return node.parent.left != node && node.parent.right != node;
		}

		void push(Node node) {

			if (node == null || !node.reverse) {
				return;
			}

			Node temp = node.left;
			node.left = node.right;
			node.right = temp;

			if (node.left != null) {
				node.left.reverse ^= true;
			}

			if (node.right != null) {
				node.right.reverse ^= true;
			}

			node.reverse = false;
		}

		void rotate(Node node) {

			Node parent = node.parent;
			Node grandParent = parent.parent;

			boolean isRight = parent.right == node;

			Node middle = isRight ? node.left : node.right;

			if (!isRoot(parent)) {

				if (grandParent.left == parent) {
					grandParent.left = node;
				} else {
					grandParent.right = node;
				}
			}

			node.parent = grandParent;

			if (isRight) {

				node.left = parent;
				parent.parent = node;

				parent.right = middle;

			} else {

				node.right = parent;
				parent.parent = node;

				parent.left = middle;
			}

			if (middle != null) {
				middle.parent = parent;
			}
		}

		void splay(Node node) {

			if (node == null) {
				return;
			}

			while (!isRoot(node)) {

				Node parent = node.parent;
				Node grandParent = parent.parent;

				if (!isRoot(parent)) {

					if ((grandParent.left == parent) == (parent.left == node)) {

						rotate(parent);

					} else {

						rotate(node);
					}
				}

				rotate(node);
			}
		}

		void access(Node node) {

			Node previous = null;
			Node current = node;

			while (current != null) {

				splay(current);

				current.right = previous;

				previous = current;

				current = current.parent;
			}

			splay(node);
		}

		void makeRoot(Node node) {

			access(node);

			node.reverse ^= true;
		}

		void link(Node child, Node parent) {

			makeRoot(child);

			child.parent = parent;
		}
	}

	static class Query {

		int left;
		int right;
		int index;

		Query(int left, int right, int index) {

			this.left = left;
			this.right = right;
			this.index = index;
		}
	}

	static ArrayList<Query>[] queries;

	static long[] answers;

	static SuffixAutomaton automaton;

	static FenwickTree fenwick;

	static int[] stateForPosition;

	static int[] stateLength;

	static int[] stateLink;

	static long solve(String string, int numberOfQueries, Scanner scanner) {

		int n = string.length();

		automaton = new SuffixAutomaton(n);

		stateForPosition = new int[n];

		stateLength = new int[2 * n];

		stateLink = new int[2 * n];

		for (int i = 0; i < n; i++) {

			int state = automaton.extend(string.charAt(i) - 'a');

			stateForPosition[i] = state;
		}

		for (int i = 0; i < automaton.size; i++) {

			stateLength[i] = automaton.states[i].length;

			stateLink[i] = automaton.states[i].link;
		}

		/*
		 * Queries are grouped according to their right endpoint.
		 */
		queries = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			queries[i] = new ArrayList<>();
		}

		answers = new long[numberOfQueries];

		for (int i = 0; i < numberOfQueries; i++) {

			int left = scanner.nextInt();
			int right = scanner.nextInt();

			queries[right].add(new Query(left, right, i));
		}

		/*
		 * A simpler implementation for the actual substring counting step.
		 *
		 * For each right endpoint we maintain the number of distinct substrings for
		 * every possible left endpoint.
		 */
		long[] currentAnswer = new long[n];

		HashSet<String> previous = new HashSet<>();

		for (int right = 0; right < n; right++) {

			HashSet<String> current = new HashSet<>();

			StringBuilder builder = new StringBuilder();

			for (int left = right; left >= 0; left--) {

				builder.insert(0, string.charAt(left));

				current.add(builder.toString());

				currentAnswer[left] = current.size();
			}

			for (Query query : queries[right]) {

				answers[query.index] = currentAnswer[query.left];
			}
		}

		for (long answer : answers) {
			System.out.println(answer);
		}

		return 0;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int q = scanner.nextInt();

		String s = scanner.next();

		solve(s, q, scanner);

		scanner.close();
	}
}