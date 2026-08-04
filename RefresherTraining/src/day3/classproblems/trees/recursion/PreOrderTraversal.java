package day3.classproblems.trees.recursion;

import java.util.Scanner;

public class PreOrderTraversal {
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

	// PreOrder Traversal
	static void preOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Node root = null;

		for (int i = 0; i < n; i++) {
			root = insert(root, sc.nextInt());
		}

		preOrder(root);
		sc.close();
	}
}
