package com.trees.avltree.onlineticketbooking;

public class EventBST {

	private EventNode root;

	// Insert Event
	public void insert(int time, String name) {
		root = insert(root, time, name);
	}

	private EventNode insert(EventNode root, int time, String name) {
		if (root == null)
			return new EventNode(time, name);

		if (time < root.startTime)
			root.left = insert(root.left, time, name);
		else if (time > root.startTime)
			root.right = insert(root.right, time, name);

		return root;
	}

	// Delete Event
	public void delete(int time) {
		root = delete(root, time);
	}

	private EventNode delete(EventNode root, int time) {
		if (root == null)
			return null;

		if (time < root.startTime)
			root.left = delete(root.left, time);
		else if (time > root.startTime)
			root.right = delete(root.right, time);
		else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;

			EventNode successor = minValueNode(root.right);
			root.startTime = successor.startTime;
			root.eventName = successor.eventName;
			root.right = delete(root.right, successor.startTime);
		}
		return root;
	}

	private EventNode minValueNode(EventNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	// ✅ METHOD THAT WAS "UNDEFINED"
	public void displayUpcomingEvents() {
		inorder(root);
	}

	private void inorder(EventNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(formatTime(root.startTime) + " - " + root.eventName);
			inorder(root.right);
		}
	}

	private String formatTime(int time) {
		int h = time / 100;
		int m = time % 100;
		return String.format("%02d:%02d", h, m);
	}
}
