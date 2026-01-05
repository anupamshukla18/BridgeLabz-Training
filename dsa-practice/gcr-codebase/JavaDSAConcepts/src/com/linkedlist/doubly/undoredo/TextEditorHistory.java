package com.linkedlist.doubly.undoredo;

class TextEditorHistory {
	private TextNode head;
	private TextNode tail;
	private TextNode current;
	private int size;
	private final int MAX_SIZE = 10;

	// Add new text state
	public void addState(String text) {
		TextNode newNode = new TextNode(text);

		// If undo was used, remove redo history
		if (current != null && current.next != null) {
			current.next.prev = null;
			current.next = null;
			tail = current;
		}

		if (head == null) {
			head = tail = current = newNode;
			size = 1;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			current = newNode;
			size++;

			// Maintain max size
			if (size > MAX_SIZE) {
				head = head.next;
				head.prev = null;
				size--;
			}
		}

		System.out.println("Text updated.");
	}

	// Undo operation
	public void undo() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Undo successful.");
		} else {
			System.out.println("No more undo available.");
		}
	}

	// Redo operation
	public void redo() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Redo successful.");
		} else {
			System.out.println("No more redo available.");
		}
	}

	// Display current text
	public void displayCurrent() {
		if (current != null) {
			System.out.println("Current Text: " + current.text);
		} else {
			System.out.println("Editor is empty.");
		}
	}
}
