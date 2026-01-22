package com.collections.queueinterface;

public class CircularBuffer {
	private int[] buffer;
	private int front;
	private int rear;
	private int size;
	private int capacity;

	public CircularBuffer(int capacity) {
		this.capacity = capacity;
		buffer = new int[capacity];
		front = 0;
		rear = 0;
		size = 0;
	}

	// Insert element (overwrite if full)
	public void insert(int value) {

		if (size == capacity) {
			// Buffer full → overwrite oldest (move front)
			front = (front + 1) % capacity;
			size--;
		}

		buffer[rear] = value;
		rear = (rear + 1) % capacity;
		size++;
	}

	// Display buffer elements from oldest to newest
	public void display() {

		if (size == 0) {
			System.out.println("Buffer is empty");
			return;
		}

		System.out.print("Buffer: [");
		for (int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			System.out.print(buffer[index]);

			if (i < size - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		CircularBuffer cb = new CircularBuffer(3);

		cb.insert(1);
		cb.insert(2);
		cb.insert(3);
		cb.display();

		cb.insert(4);
		cb.display();
	}
}
