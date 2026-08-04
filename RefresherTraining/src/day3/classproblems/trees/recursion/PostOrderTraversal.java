package day3.classproblems.trees.recursion;

import java.util.Scanner;

public class PostOrderTraversal {
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

	// PostOrder Traversal
	static void postOrder(Node root) {
	    if (root == null)
	        return;

	    postOrder(root.left);
	    postOrder(root.right);
	    System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();
	    Node root = null;

	    for (int i = 0; i < n; i++) {
	        root = insert(root, sc.nextInt());
	    }

	    postOrder(root);
	    sc.close();
	}
}
