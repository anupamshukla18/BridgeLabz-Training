package com.linkedlist.circular.taskscheduler;

class TaskCircularList {
	private TaskNode head;
	private TaskNode tail;
	private TaskNode current; // for scheduling

	// Add at beginning
	public void addAtBeginning(int id, String name, int priority, String date) {
		TaskNode newNode = new TaskNode(id, name, priority, date);

		if (head == null) {
			head = tail = newNode;
			newNode.next = head;
			current = head;
		} else {
			newNode.next = head;
			tail.next = newNode;
			head = newNode;
		}
		System.out.println("Task added at beginning.");
	}

	// Add at end
	public void addAtEnd(int id, String name, int priority, String date) {
		TaskNode newNode = new TaskNode(id, name, priority, date);

		if (head == null) {
			head = tail = newNode;
			newNode.next = head;
			current = head;
		} else {
			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
		System.out.println("Task added at end.");
	}

	// Add at specific position
	public void addAtPosition(int pos, int id, String name, int priority, String date) {
		if (pos <= 0) {
			System.out.println("Invalid position.");
			return;
		}

		if (pos == 1) {
			addAtBeginning(id, name, priority, date);
			return;
		}

		TaskNode temp = head;
		for (int i = 1; i < pos - 1 && temp.next != head; i++) {
			temp = temp.next;
		}

		TaskNode newNode = new TaskNode(id, name, priority, date);
		newNode.next = temp.next;
		temp.next = newNode;

		if (temp == tail) {
			tail = newNode;
		}

		System.out.println("Task added at position " + pos);
	}

	// Remove by Task ID
	public void removeById(int id) {
		if (head == null) {
			System.out.println("Task list is empty.");
			return;
		}

		TaskNode curr = head;
		TaskNode prev = tail;

		do {
			if (curr.taskId == id) {
				if (curr == head) {
					head = head.next;
					tail.next = head;
				} else if (curr == tail) {
					tail = prev;
					tail.next = head;
				} else {
					prev.next = curr.next;
				}

				if (current == curr) {
					current = curr.next;
				}

				System.out.println("Task removed.");
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		System.out.println("Task not found.");
	}

	// View current task and move to next
	public void viewNextTask() {
		if (current == null) {
			System.out.println("No tasks available.");
			return;
		}

		System.out.println("Current Task:");
		displayTask(current);
		current = current.next;
	}

	// Display all tasks
	public void displayAll() {
		if (head == null) {
			System.out.println("No tasks to display.");
			return;
		}

		TaskNode temp = head;
		System.out.println("\n--- Task List ---");
		do {
			displayTask(temp);
			temp = temp.next;
		} while (temp != head);
	}

	// Search by priority
	public void searchByPriority(int priority) {
		if (head == null) {
			System.out.println("Task list is empty.");
			return;
		}

		TaskNode temp = head;
		boolean found = false;

		do {
			if (temp.priority == priority) {
				displayTask(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found) {
			System.out.println("No task found with priority " + priority);
		}
	}

	private void displayTask(TaskNode t) {
		System.out.println(
				"ID: " + t.taskId + ", Name: " + t.taskName + ", Priority: " + t.priority + ", Due Date: " + t.dueDate);
	}
}