package com.trees.avltree.gamingapp;

public class AVLTree {

	private PlayerNode root;

	// 🔹 Height
	private int height(PlayerNode n) {
		return n == null ? 0 : n.height;
	}

	// 🔹 Balance Factor
	private int getBalance(PlayerNode n) {
		return n == null ? 0 : height(n.left) - height(n.right);
	}

	// 🔹 Right Rotate (LL)
	private PlayerNode rightRotate(PlayerNode y) {
		PlayerNode x = y.left;
		PlayerNode t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// 🔹 Left Rotate (RR)
	private PlayerNode leftRotate(PlayerNode x) {
		PlayerNode y = x.right;
		PlayerNode t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// 🔹 Insert / Update Player
	public void insert(int score, String player) {
		root = insert(root, score, player);
	}

	private PlayerNode insert(PlayerNode node, int score, String player) {
		if (node == null)
			return new PlayerNode(score, player);

		if (score < node.score)
			node.left = insert(node.left, score, player);
		else if (score > node.score)
			node.right = insert(node.right, score, player);
		else
			return node;

		node.height = 1 + Math.max(height(node.left), height(node.right));

		int balance = getBalance(node);

		// LL
		if (balance > 1 && score < node.left.score)
			return rightRotate(node);

		// RR
		if (balance < -1 && score > node.right.score)
			return leftRotate(node);

		// LR
		if (balance > 1 && score > node.left.score) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL
		if (balance < -1 && score < node.right.score) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// 🔹 Delete Player
	public void delete(int score) {
		root = delete(root, score);
	}

	private PlayerNode delete(PlayerNode root, int score) {
		if (root == null)
			return null;

		if (score < root.score)
			root.left = delete(root.left, score);
		else if (score > root.score)
			root.right = delete(root.right, score);
		else {
			if (root.left == null || root.right == null) {
				root = (root.left != null) ? root.left : root.right;
			} else {
				PlayerNode temp = minValueNode(root.right);
				root.score = temp.score;
				root.player = temp.player;
				root.right = delete(root.right, temp.score);
			}
		}

		if (root == null)
			return null;

		root.height = Math.max(height(root.left), height(root.right)) + 1;
		int balance = getBalance(root);

		// Rebalance
		if (balance > 1 && getBalance(root.left) >= 0)
			return rightRotate(root);

		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		if (balance < -1 && getBalance(root.right) <= 0)
			return leftRotate(root);

		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	private PlayerNode minValueNode(PlayerNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	// 🔹 Display Top 10 Players
	public void displayTopPlayers() {
		int[] count = { 0 };
		reverseInorder(root, count);
	}

	private void reverseInorder(PlayerNode node, int[] count) {
		if (node == null || count[0] >= 10)
			return;

		reverseInorder(node.right, count);

		if (count[0] < 10) {
			System.out.println(node.player + " → " + node.score);
			count[0]++;
		}

		reverseInorder(node.left, count);
	}
}
