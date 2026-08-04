package day2.classproblems.queueusinglinkedlist;

public class CustomQueue {

    private Node front;
    private Node rear;
    private int size;

    public CustomQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Enqueue (Insert)
    public void enqueue(int val) {
        Node node = new Node(val);

        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }

        size++;
    }

    // Dequeue (Delete)
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = front.val;
        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        size--;
        return removed;
    }

    // Peek operation
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return front.val;
    }

    // Checking if the queue is empty or not
    public boolean isEmpty() {
        return front == null;
    }

    // Size of the queue
    public int size() {
        return size;
    }

    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.val + " <- ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // Node class
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}