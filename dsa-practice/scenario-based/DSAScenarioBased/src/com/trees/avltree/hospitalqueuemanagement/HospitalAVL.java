package com.trees.avltree.hospitalqueuemanagement;

public class HospitalAVL {

	private PatientNode root;

	// Height
	private int height(PatientNode n) {
		return n == null ? 0 : n.height;
	}

	// Balance Factor
	private int getBalance(PatientNode n) {
		return n == null ? 0 : height(n.left) - height(n.right);
	}

	// Right Rotation (LL)
	private PatientNode rightRotate(PatientNode y) {
		PatientNode x = y.left;
		PatientNode t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left Rotation (RR)
	private PatientNode leftRotate(PatientNode x) {
		PatientNode y = x.right;
		PatientNode t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// 🔹 Scenario 1: Patient Registration
	public void registerPatient(int time, String name) {
		root = insert(root, time, name);
	}

	private PatientNode insert(PatientNode node, int time, String name) {
		if (node == null)
			return new PatientNode(time, name);

		if (time < node.checkInTime)
			node.left = insert(node.left, time, name);
		else if (time > node.checkInTime)
			node.right = insert(node.right, time, name);

		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balance = getBalance(node);

		// LL
		if (balance > 1 && time < node.left.checkInTime)
			return rightRotate(node);

		// RR
		if (balance < -1 && time > node.right.checkInTime)
			return leftRotate(node);

		// LR
		if (balance > 1 && time > node.left.checkInTime) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL
		if (balance < -1 && time < node.right.checkInTime) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// 🔹 Scenario 2: Discharge Patient
	public void dischargePatient(int time) {
		root = delete(root, time);
	}

	private PatientNode delete(PatientNode root, int time) {
		if (root == null)
			return null;

		if (time < root.checkInTime)
			root.left = delete(root.left, time);
		else if (time > root.checkInTime)
			root.right = delete(root.right, time);
		else {
			if (root.left == null || root.right == null) {
				root = (root.left != null) ? root.left : root.right;
			} else {
				PatientNode successor = minValueNode(root.right);
				root.checkInTime = successor.checkInTime;
				root.name = successor.name;
				root.right = delete(root.right, successor.checkInTime);
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

	private PatientNode minValueNode(PatientNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	// 🔹 Scenario 3: Display by Arrival Time
	public void displayPatientsByArrival() {
		inorder(root);
	}

	private void inorder(PatientNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(formatTime(node.checkInTime) + " - " + node.name);
			inorder(node.right);
		}
	}

	// ✅ THIS METHOD IS NOW CORRECTLY INSIDE THE CLASS
	private String formatTime(int time) {
		int h = time / 100;
		int m = time % 100;
		return String.format("%02d:%02d", h, m);
	}
}
