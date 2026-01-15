package com.trees.problem3;

public class BSTLibrarySystem {

    // Insert a node into BST
    static Node insert(Node root, int isbn) {
        if (root == null) {
            return new Node(isbn);
        }

        if (isbn < root.isbn) {
            root.left = insert(root.left, isbn);
        } else if (isbn > root.isbn) {
            root.right = insert(root.right, isbn);
        }

        return root;
    }

    // Inorder Traversal (Left -> Root -> Right)
    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.isbn + " ");
        inorder(root.right);
    }

    // Search with comparison sequence
    static void search(Node root, int key) {
        System.out.println("\nSearch Comparisons:");
        Node current = root;

        while (current != null) {
            System.out.println("Comparing with: " + current.isbn);

            if (key == current.isbn) {
                System.out.println("ISBN " + key + " FOUND");
                return;
            } else if (key < current.isbn) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        System.out.println("ISBN NOT FOUND");
    }

    // Validate BST using min-max logic
    static boolean isValidBST(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.isbn <= min || root.isbn >= max)
            return false;

        return isValidBST(root.left, min, root.isbn) &&
               isValidBST(root.right, root.isbn, max);
    }

    // Height of BST
    static int height(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Main Method
    public static void main(String[] args) {

        /*
            ISBN insertion order:
            50, 30, 70, 20, 40, 60, 80, 10, 25
        */

        int[] isbns = {50, 30, 70, 20, 40, 60, 80, 10, 25};
        Node root = null;

        // Construct BST
        for (int isbn : isbns) {
            root = insert(root, isbn);
        }

        // Inorder Traversal
        System.out.println("Inorder Traversal (Sorted ISBNs):");
        inorder(root);

        // Search ISBN 25
        search(root, 25);

        // Validate BST
        System.out.println("\nIs this a valid BST?");
        System.out.println(isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        // Height of constructed BST
        System.out.println("\nHeight of constructed BST: " + height(root));

        // Height of skewed BST with same 9 elements
        System.out.println("Height of completely skewed BST with 9 nodes: 9");
    }
}
