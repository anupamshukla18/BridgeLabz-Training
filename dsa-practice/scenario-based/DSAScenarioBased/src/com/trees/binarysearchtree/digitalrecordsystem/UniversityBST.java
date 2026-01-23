package com.trees.binarysearchtree.digitalrecordsystem;

import java.util.Scanner;

public class UniversityBST {

	// Insert
	static StudentRecord insert(StudentRecord root, int roll, String name) {
		if (root == null)
			return new StudentRecord(roll, name);
		if (roll < root.roll)
			root.left = insert(root.left, roll, name);
		else if (roll > root.roll)
			root.right = insert(root.right, roll, name);
		return root;
	}

	// Search
	static StudentRecord search(StudentRecord root, int roll) {
		if (root == null || root.roll == roll)
			return root;
		if (roll < root.roll)
			return search(root.left, roll);
		return search(root.right, roll);
	}

	// Find minimum (for delete)
	static StudentRecord minValue(StudentRecord node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	// Delete
	static StudentRecord delete(StudentRecord root, int roll) {
		if (root == null)
			return null;

		if (roll < root.roll)
			root.left = delete(root.left, roll);
		else if (roll > root.roll)
			root.right = delete(root.right, roll);
		else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;

			StudentRecord successor = minValue(root.right);
			root.roll = successor.roll;
			root.name = successor.name;
			root.right = delete(root.right, successor.roll);
		}
		return root;
	}

	// Inorder (sorted display)
	static void inorder(StudentRecord root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println("Roll: " + root.roll + ", Name: " + root.name);
		inorder(root.right);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentRecord root = null;

		while (true) {
			System.out.println("\n1.Insert  2.Delete  3.Search  4.Display(Sorted)  5.Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter roll: ");
				int r = sc.nextInt();
				System.out.print("Enter name: ");
				String n = sc.next();
				root = insert(root, r, n);
				break;

			case 2:
				System.out.print("Enter roll to delete: ");
				root = delete(root, sc.nextInt());
				break;

			case 3:
				System.out.print("Enter roll to search: ");
				StudentRecord s = search(root, sc.nextInt());
				if (s != null)
					System.out.println("Found: " + s.name);
				else
					System.out.println("Record not found");
				break;

			case 4:
				System.out.println("Student Records (Sorted by Roll):");
				inorder(root);
				break;

			case 5:
				return;
			}
		}
	}
}