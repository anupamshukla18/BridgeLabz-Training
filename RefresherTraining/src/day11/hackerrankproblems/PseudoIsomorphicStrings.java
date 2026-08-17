package day11.hackerrankproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PseudoIsomorphicStrings {
	static class Node {

		int depth;
		Node suffixLink;
		Map<Integer, Edge> edges = new HashMap<>();

		Node(int depth) {
			this.depth = depth;
		}
	}

	static class Edge {

		int suffixStart;
		int from;
		int to;
		Node next;

		Edge(int suffixStart, int from, int to, Node next) {
			this.suffixStart = suffixStart;
			this.from = from;
			this.to = to;
			this.next = next;
		}

		int length() {
			return to - from;
		}
	}

	static class ActivePoint {

		Node node;
		Integer edgeValue;
		int length;

		ActivePoint(Node node, Integer edgeValue, int length) {
			this.node = node;
			this.edgeValue = edgeValue;
			this.length = length;
		}

		Edge getEdge() {
			return node.edges.get(edgeValue);
		}
	}

	static int[] values;
	static Node root;

	static ActivePoint activePoint;

	static int remainder;
	static long leaves;
	static long answer;

	/*
	 * Convert previous-occurrence distance into the canonical value at a particular
	 * depth.
	 *
	 * If the previous occurrence is outside the current substring, all such values
	 * are treated as equivalent.
	 */
	static int convert(int value, int depth) {
		return value > depth ? -1 : value;
	}

	/*
	 * Get the value of a suffix-array representation at a particular position.
	 */
	static int getValue(int suffixStart, int position) {

		if (suffixStart <= position - values[position]) {
			return values[position];
		}

		return 0;
	}

	/*
	 * Move the active point down until it lies inside an edge or exactly on a node.
	 */
	static ActivePoint walkDown(ActivePoint point, int suffixStart) {

		while (point.length > 0) {

			Edge edge = point.getEdge();

			if (point.length < edge.length()) {
				break;
			}

			if (point.length == edge.length()) {

				point = new ActivePoint(edge.next, null, 0);

			} else {

				int valueAtEnd = getValue(suffixStart, edge.from + edge.length());

				point = new ActivePoint(edge.next, valueAtEnd, point.length - edge.length());
			}
		}

		return point;
	}

	/*
	 * Insert one new suffix into the pseudo-isomorphic suffix tree.
	 */
	static void addSuffix(int index) {

		remainder++;

		Node previousNode = null;

		while (remainder > 0) {

			int suffixStart = index - remainder + 1;

			int value = getValue(suffixStart, index);

			/*
			 * Active point is exactly at a node.
			 */
			if (activePoint.length == 0) {

				Node currentNode = activePoint.node;

				Edge existing = currentNode.edges.get(value);

				if (existing != null) {

					if (previousNode != null) {
						previousNode.suffixLink = currentNode;
					}

					activePoint = new ActivePoint(currentNode, value, 1);

					if (activePoint.length == existing.length()) {

						activePoint = new ActivePoint(existing.next, null, 0);
					}

					break;
				}

				/*
				 * No edge exists.
				 */
				Node leaf = new Node(-1);

				currentNode.edges.put(value, new Edge(suffixStart, index, values.length, leaf));

				leaves++;

				if (previousNode != null) {
					previousNode.suffixLink = currentNode;
				}

				previousNode = currentNode;

				if (currentNode == root) {

					remainder--;

					activePoint = new ActivePoint(root, null, 0);

				} else {

					if (currentNode.suffixLink != null) {

						Node link = currentNode.suffixLink;

						activePoint = new ActivePoint(link, null, 0);

					} else {

						activePoint = new ActivePoint(root, null, remainder - 1);
					}

					activePoint = walkDown(activePoint, suffixStart + 1);

					remainder--;
				}

				continue;
			}

			/*
			 * Active point lies inside an edge.
			 */
			Edge edge = activePoint.getEdge();

			int edgePosition = edge.from + activePoint.length;

			int currentValue = getValue(edge.suffixStart, edgePosition);

			if (convert(currentValue, activePoint.node.depth + activePoint.length) == convert(value,
					activePoint.node.depth + activePoint.length)) {

				activePoint = new ActivePoint(activePoint.node, activePoint.edgeValue, activePoint.length + 1);

				if (activePoint.length == edge.length()) {

					activePoint = new ActivePoint(edge.next, null, 0);
				}

				break;
			}

			/*
			 * Split the edge.
			 */
			Node branch = new Node(activePoint.node.depth + activePoint.length);

			Edge oldEdge = new Edge(edge.suffixStart, edge.from + activePoint.length, edge.to, edge.next);

			branch.edges.put(convert(getValue(edge.suffixStart, oldEdge.from), branch.depth), oldEdge);

			Node leaf = new Node(-1);

			branch.edges.put(convert(value, branch.depth), new Edge(suffixStart, index, values.length, leaf));

			activePoint.node.edges.put(activePoint.edgeValue,
					new Edge(edge.suffixStart, edge.from, edge.from + activePoint.length, branch));

			leaves++;

			if (previousNode != null) {
				previousNode.suffixLink = branch;
			}

			previousNode = branch;

			/*
			 * Follow suffix link.
			 */
			Node linkNode = activePoint.node.suffixLink;

			if (linkNode == null) {

				activePoint = new ActivePoint(root, null, remainder - 1);

			} else {

				int linkDepth = linkNode.depth;

				int linkPosition = suffixStart + linkDepth;

				int linkValue = getValue(suffixStart, linkPosition);

				activePoint = new ActivePoint(linkNode, linkValue, index - linkPosition);
			}

			activePoint = walkDown(activePoint, suffixStart + 1);

			remainder--;
		}
	}

	static long solve(String s) {

		int n = s.length();

		values = new int[n];

		Map<Character, Integer> previous = new HashMap<>();

		/*
		 * Build previous-occurrence distance array.
		 */
		for (int i = 0; i < n; i++) {

			char current = s.charAt(i);

			if (previous.containsKey(current)) {

				values[i] = i - previous.get(current);

			} else {

				/*
				 * A value larger than every possible substring depth represents "not seen".
				 */
				values[i] = i + 1;
			}

			previous.put(current, i);
		}

		root = new Node(0);

		activePoint = new ActivePoint(root, null, 0);

		remainder = 0;
		leaves = 0;
		answer = 0;

		/*
		 * Add characters one by one.
		 *
		 * The number of leaves represents the number of pseudo-isomorphism classes
		 * introduced so far.
		 */
		for (int i = 0; i < n; i++) {

			addSuffix(i);

			answer += leaves;

			System.out.println(answer);
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.next();

		solve(inputString);

		scanner.close();
	}
}