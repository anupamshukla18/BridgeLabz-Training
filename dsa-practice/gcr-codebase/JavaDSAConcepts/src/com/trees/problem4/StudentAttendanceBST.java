package com.trees.problem4;

public class StudentAttendanceBST {
    // Insert into BST
    static Node insert(Node root, int roll) {
        if (root == null)
            return new Node(roll);

        if (roll < root.roll)
            root.left = insert(root.left, roll);
        else if (roll > root.roll)
            root.right = insert(root.right, roll);

        return root;
    }

    // Find minimum value node (used in deletion)
    static Node minValue(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Delete a node from BST
    static Node delete(Node root, int roll) {
        if (root == null)
            return null;

        if (roll < root.roll) {
            root.left = delete(root.left, roll);
        } else if (roll > root.roll) {
            root.right = delete(root.right, roll);
        } else {
            // Case 1 & 2: one or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: two children
            Node successor = minValue(root.right);
            root.roll = successor.roll;
            root.right = delete(root.right, successor.roll);
        }
        return root;
    }

    // Inorder Traversal
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.roll + " ");
        inorder(root.right);
    }

    // Main Method
    public static void main(String[] args) {

        int[] rolls = {15, 10, 20, 8, 12, 17, 25};
        Node root = null;

        // Create BST
        for (int r : rolls)
            root = insert(root, r);

        System.out.println("Original BST (Inorder):");
        inorder(root);

        // Delete node 10
        root = delete(root, 10);
        System.out.println("\n\nAfter deleting 10:");
        inorder(root);

        // Insert 14
        root = insert(root, 14);
        System.out.println("\n\nAfter inserting 14:");
        inorder(root);

        // Insert 9
        root = insert(root, 9);
        System.out.println("\n\nAfter inserting 9:");
        inorder(root);
    }
}
