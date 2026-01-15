package com.trees.problem3;

class Node {
	int isbn;
	Node left, right;

	// Constructor
	Node(int isbn) {
		this.isbn = isbn;
		left = right = null;
	}
}