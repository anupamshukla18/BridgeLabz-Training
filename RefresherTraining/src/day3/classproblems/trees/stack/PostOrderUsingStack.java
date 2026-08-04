package day3.classproblems.trees.stack;

import java.util.Scanner;
import java.util.Stack;

public class PostOrderUsingStack {
	// Insert into BST
	static Node insert(Node root, int data) {
		if (root == null)
			return new Node(data);

		if (data <= root.data)
			root.left = insert(root.left, data);
		else
			root.right = insert(root.right, data);

		return root;
	}

	// Postorder using Stack
	static void postOrder(Node root) {
		if (root == null) return;
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();

		s1.push(root);

		while (!s1.isEmpty()) {
			Node curr = s1.pop();
			s2.push(curr);

			if (curr.left != null)
				s1.push(curr.left);

			if (curr.right != null)
				s1.push(curr.right);
		}

		while (!s2.isEmpty())
			System.out.print(s2.pop().data + " ");
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Node root = null;

		for (int i = 0; i < n; i++)
			root = insert(root, sc.nextInt());

		postOrder(root);
		sc.close();
	}
}
