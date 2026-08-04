package day3.classproblems.trees.stack;

import java.util.Scanner;
import java.util.Stack;

public class PreOrderUsingStack {
	static Node insert(Node root, int data) {
		if (root == null)
			return new Node(data);

		if (data <= root.data)
			root.left = insert(root.left, data);
		else
			root.right = insert(root.right, data);

		return root;
	}
 
	// PreOrder using Stack
	static void preOrder(Node root) {
		if (root == null)
			return;

		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node curr = stack.pop();
			System.out.print(curr.data + " ");

			if (curr.right != null)
				stack.push(curr.right);

			if (curr.left != null)
				stack.push(curr.left);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Node root = null;

		for (int i = 0; i < n; i++)
			root = insert(root, sc.nextInt());

		preOrder(root);
		sc.close();
	}
}
