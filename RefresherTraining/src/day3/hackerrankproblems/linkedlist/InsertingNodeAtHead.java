package day3.hackerrankproblems.linkedlist;

import java.util.Scanner;

public class InsertingNodeAtHead {
	static Node insertNodeAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertNodeAtHead(head, data);
        }

        printLinkedList(head);
        sc.close();
    }
}
