package com.trees.binarysearchtree.productinventory;

class ProductBST {

	Node root;

	// Insert
	Node insert(Node root, Product p) {
		if (root == null)
			return new Node(p);

		if (p.sku < root.product.sku)
			root.left = insert(root.left, p);
		else if (p.sku > root.product.sku)
			root.right = insert(root.right, p);

		return root;
	}

	// Search
	Node search(Node root, int sku) {
		if (root == null || root.product.sku == sku)
			return root;

		if (sku < root.product.sku)
			return search(root.left, sku);

		return search(root.right, sku);
	}

	// Inorder Traversal (Sorted Output)
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.product.sku + " | " + root.product.name + " | ₹" + root.product.price);
			inorder(root.right);
		}
	}
}