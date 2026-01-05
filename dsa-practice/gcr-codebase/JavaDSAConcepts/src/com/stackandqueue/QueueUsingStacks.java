package com.stackandqueue;

import java.util.Stack;

class QueueUsingStacks {
	// Two stacks
	private Stack<Integer> stackEnqueue = new Stack<>();
	private Stack<Integer> stackDequeue = new Stack<>();

	// Enqueue operation
	public void enqueue(int data) {
		stackEnqueue.push(data);
		System.out.println(data + " enqueued"); 
	}

	// Dequeue operation
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}

		// Transfer elements if dequeue stack is empty
		if (stackDequeue.isEmpty()) {
			while (!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop());
			}
		}

		return stackDequeue.pop();
	}

	// Peek front element
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}

		if (stackDequeue.isEmpty()) {
			while (!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop());
			}
		}

		return stackDequeue.peek();
	}

	// Check if queue is empty
	public boolean isEmpty() {
		return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
	}

	// Main method to test
	public static void main(String[] args) {

		QueueUsingStacks queue = new QueueUsingStacks();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Front: " + queue.peek());
		System.out.println("Dequeued: " + queue.dequeue());
	}
}
