package day2.classproblems.stackusinglinkedlist;

public class CustomStack {
	private Node top;
	private int size;

	public CustomStack() {
		this.size = 0;
		this.top = null;
	}

	// Push operation
	public void push(int val) {
		Node node = new Node(val);
		node.next = top;
		top = node;

		size++;
	}

	// Pop operation
	public int pop() throws StackException{
		if (top == null) {
			throw new StackException("Cannot pop from an empty stack");
		}
		int poppedElement = top.val;
		top = top.next;
		size--;
		
		return poppedElement;
	}

	// Peek operation
	public int peek() throws StackException{
		if (top == null) {
			throw new StackException("Cannot peek from an empty stack");
		}
		return top.val;
	}
	
	private class Node {
		private int val;
		private Node next;

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

		public Node(int val) {
			this.val = val;
		}
	}
}
