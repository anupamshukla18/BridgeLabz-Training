package com.trees.problem2;

public class FileSystemTraversal {

	// Preorder Traversal: Root -> Left -> Right
	static void preorder(TreeNode node) {
		if (node == null)
			return;

		System.out.print(node.name + " ");
		preorder(node.left);
		preorder(node.right);
	}

	// Inorder Traversal: Left -> Root -> Right
	static void inorder(TreeNode node) {
		if (node == null)
			return;

		inorder(node.left);
		System.out.print(node.name + " ");
		inorder(node.right);
	}

	// Postorder Traversal: Left -> Right -> Root
	static void postorder(TreeNode node) {
		if (node == null)
			return;

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.name + " ");
	}

	// Main Driver Code
	public static void main(String[] args) {
		TreeNode root = new TreeNode("root");

		root.left = new TreeNode("home");
		root.right = new TreeNode("var");

		root.left.left = new TreeNode("user");
		root.left.right = new TreeNode("docs");

		root.right.right = new TreeNode("log");

		root.left.left.left = new TreeNode("config");

		// Traversal Outputs
		System.out.println("Preorder Traversal (Backup Creation):");
		preorder(root);

		System.out.println("\n\nInorder Traversal (Alphabetical if BST):");
		inorder(root);

		System.out.println("\n\nPostorder Traversal (Safe Deletion):");
		postorder(root);
	}
}
