package com.trees.problem1;

import java.util.*; 

public class OrganizationTree {

	// a) Find all leaf nodes
	static void findLeafNodes(TreeNode node, List<String> leaves) {
		if (node.children.isEmpty()) {
			leaves.add(node.name);
			return;
		}
		for (TreeNode child : node.children) {
			findLeafNodes(child, leaves);
		}
	}

	// b) Find height of tree
	static int findHeight(TreeNode node) {
		if (node == null)
			return -1;

		int maxHeight = -1;
		for (TreeNode child : node.children) {
			maxHeight = Math.max(maxHeight, findHeight(child));
		}
		return maxHeight + 1;
	}

	// c) Find depth of a given node
	static int findDepth(TreeNode root, String target, int depth) {
		if (root.name.equals(target))
			return depth;

		for (TreeNode child : root.children) {
			int result = findDepth(child, target, depth + 1);
			if (result != -1)
				return result;
		}
		return -1;
	}

	// d) Find ancestors of a node
	static boolean findAncestors(TreeNode root, String target, List<String> ancestors) {
		if (root.name.equals(target))
			return true;

		for (TreeNode child : root.children) {
			if (findAncestors(child, target, ancestors)) {
				ancestors.add(root.name);
				return true;
			}
		}
		return false;
	}

	// e) Find degree of a node
	static int findDegree(TreeNode root, String target) {
		if (root.name.equals(target))
			return root.children.size();

		for (TreeNode child : root.children) {
			int degree = findDegree(child, target);
			if (degree != -1)
				return degree;
		}
		return -1;
	}

	public static void main(String[] args) {

		// Creating nodes
		TreeNode CEO = new TreeNode("CEO");
		TreeNode CTO = new TreeNode("CTO");
		TreeNode CFO = new TreeNode("CFO");
		TreeNode devLead = new TreeNode("Dev Lead");
		TreeNode HR = new TreeNode("HR");
		TreeNode dev1 = new TreeNode("Dev1");
		TreeNode dev2 = new TreeNode("Dev2");

		// Building the tree
		CEO.addChild(CTO);
		CEO.addChild(CFO);

		CTO.addChild(devLead);
		CTO.addChild(dev2);

		CFO.addChild(HR);

		devLead.addChild(dev1);

		// a) Leaf nodes
		List<String> leafNodes = new ArrayList<>();
		findLeafNodes(CEO, leafNodes);
		System.out.println("Leaf Nodes: " + leafNodes);

		// b) Height of tree
		System.out.println("Height of Tree: " + findHeight(CEO));

		// c) Depth of Dev Lead
		System.out.println("Depth of Dev Lead: " + findDepth(CEO, "Dev Lead", 0));

		// d) Ancestors of Dev1
		List<String> ancestors = new ArrayList<>();
		findAncestors(CEO, "Dev1", ancestors);
		System.out.println("Ancestors of Dev1: " + ancestors);

		// e) Degree of CTO
		System.out.println("Degree of CTO: " + findDegree(CEO, "CTO"));
	}
}
