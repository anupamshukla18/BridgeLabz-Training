package day2.classproblems.queueusingarray;

public class CustomQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    // Inserting an element
    public boolean enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        data[end++] = item;
        return true;
    }

    // Removing an element
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        // Shifting all the elements to the left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;

        return removed;
    }

    // Viewing the front element
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return data[0];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public int size() {
        return end;
    }

    // Displaying the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }

        System.out.println("END");
    }
}