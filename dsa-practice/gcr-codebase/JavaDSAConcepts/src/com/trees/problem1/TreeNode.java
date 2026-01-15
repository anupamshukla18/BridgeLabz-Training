package com.trees.problem1;

import java.util.ArrayList;
import java.util.List;

//Node class representing each employee in the organization
class TreeNode {
	String name;
	List<TreeNode> children;

	// Constructor
	TreeNode(String name) {
		this.name = name;
		this.children = new ArrayList<>();
	}

	// Method to add child
	void addChild(TreeNode child) {
		children.add(child);
	}
}
