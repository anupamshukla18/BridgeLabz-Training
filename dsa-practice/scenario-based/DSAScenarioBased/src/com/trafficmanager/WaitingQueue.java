package com.trafficmanager;

// Simple Queue using array
class WaitingQueue {
	String[] queue;
	int front, rear, size, capacity;

	WaitingQueue(int capacity) {
		this.capacity = capacity;
		queue = new String[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	boolean isFull() {
		return size == capacity;
	}

	boolean isEmpty() {
		return size == 0;
	}

	void enqueue(String vehicleNo) {
		if (isFull()) {
			System.out.println("Queue Overflow! Cannot add vehicle.");
			return;
		}
		rear = (rear + 1) % capacity;
		queue[rear] = vehicleNo;
		size++;
		System.out.println("Vehicle added to waiting queue.");
	}

	String dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Underflow! No vehicle waiting.");
			return null;
		}
		String vehicle = queue[front];
		front = (front + 1) % capacity;
		size--;
		return vehicle;
	}
}
