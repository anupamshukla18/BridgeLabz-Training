package day2.classproblems.circularqueue;

public class CircularQueue {

    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int rear = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    // Inserting an element
    public boolean enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        data[rear] = item;
        rear = (rear + 1) % data.length;
        size++;

        return true;
    }

    // Removing an element
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[front];
        front = (front + 1) % data.length;
        size--;

        return removed;
    }

    // Viewing the front element
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return data[front];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Displaying the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        do {
            System.out.print(data[i] + " <- ");
            i = (i + 1) % data.length;
        } while (i != rear);

        System.out.println("END");
    }
}