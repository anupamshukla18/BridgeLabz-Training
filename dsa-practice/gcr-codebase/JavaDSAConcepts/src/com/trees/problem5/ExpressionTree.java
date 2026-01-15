package com.trees.problem5;

public class ExpressionTree {
    // Inorder Traversal
    static void inorder(Node root) {
        if (root == null) return;

        if (root.left != null) System.out.print("(");
        inorder(root.left);
        System.out.print(root.value);
        inorder(root.right);
        if (root.right != null) System.out.print(")");
    }

    // Preorder Traversal
    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal
    static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    // Main Method
    public static void main(String[] args) {

        /*
            Expression: (3 + 5) * (8 - 2)
        */

        Node root = new Node("*");
        root.left = new Node("+");
        root.right = new Node("-");

        root.left.left = new Node("3");
        root.left.right = new Node("5");

        root.right.left = new Node("8");
        root.right.right = new Node("2");

        System.out.println("Inorder Traversal (Infix):");
        inorder(root);

        System.out.println("\n\nPreorder Traversal (Prefix):");
        preorder(root);

        System.out.println("\n\nPostorder Traversal (Postfix):");
        postorder(root);

        /*
            Expression: a * b + c / d - e
        */

        Node root2 = new Node("-");
        root2.left = new Node("+");
        root2.right = new Node("e");

        root2.left.left = new Node("*");
        root2.left.right = new Node("/");

        root2.left.left.left = new Node("a");
        root2.left.left.right = new Node("b");

        root2.left.right.left = new Node("c");
        root2.left.right.right = new Node("d");

        System.out.println("\n\n\nExpression: a * b + c / d - e");

        System.out.println("Inorder:");
        inorder(root2);

        System.out.println("\n\nPreorder:");
        preorder(root2);

        System.out.println("\n\nPostorder:");
        postorder(root2);
    }
}
