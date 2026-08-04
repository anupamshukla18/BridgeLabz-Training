package day3.classproblems.trees.stack;

import java.util.Scanner;
import java.util.Stack;

public class InOrderUsingStack {
	// Inserting into the tree
	static Node insert(Node root, int data) {
		if (root == null)
			return new Node(data);

		if (data <= root.data)
			root.left = insert(root.left, data);
		else
			root.right = insert(root.right, data);

		return root;
	}

	// InOrder using Stack
	static void inOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		Node curr = root;

		while (curr != null || !stack.isEmpty()) {

			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}

			curr = stack.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Node root = null;

		for (int i = 0; i < n; i++)
			root = insert(root, sc.nextInt());

		inOrder(root);
		sc.close();
	}
}
