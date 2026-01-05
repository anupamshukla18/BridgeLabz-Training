package com.linkedlist.circular.roundrobinalgo;

class RoundRobinScheduler {
	private ProcessNode head = null;
	private ProcessNode tail = null;
	private int processCount = 0;

	// Add process at end
	public void addProcess(int id, int burst, int priority) {
		ProcessNode newNode = new ProcessNode(id, burst, priority);

		if (head == null) {
			head = tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
		processCount++;
		System.out.println("Process added.");
	}

	// Round Robin Scheduling Simulation
	public void schedule(int timeQuantum) {
		if (head == null) {
			System.out.println("No processes to schedule.");
			return;
		}

		ProcessNode current = head;
		int currentTime = 0;
		int completed = 0;

		System.out.println("\n--- Round Robin Scheduling Started ---");

		while (completed < processCount) {
			displayQueue();

			if (current.remainingTime > 0) {
				int execTime = Math.min(timeQuantum, current.remainingTime);
				current.remainingTime -= execTime;
				currentTime += execTime;

				// Update waiting time for other processes
				ProcessNode temp = head;
				do {
					if (temp != current && temp.remainingTime > 0) {
						temp.waitingTime += execTime;
					}
					temp = temp.next;
				} while (temp != head);

				// If process completes
				if (current.remainingTime == 0) {
					current.turnaroundTime = currentTime;
					completed++;
					System.out.println("Process " + current.processId + " completed.");
				}
			}

			current = current.next;
		}

		calculateAverages();
	}

	// Display circular queue
	public void displayQueue() {
		if (head == null)
			return;

		ProcessNode temp = head;
		System.out.println("\nCurrent Process Queue:");
		do {
			System.out.println("PID: " + temp.processId + ", Remaining Time: " + temp.remainingTime + ", Priority: "
					+ temp.priority);
			temp = temp.next;
		} while (temp != head);
	}

	// Calculate average waiting & turnaround time
	private void calculateAverages() {
		double totalWaiting = 0, totalTurnaround = 0;
		ProcessNode temp = head;

		System.out.println("\n--- Process Summary ---");
		do {
			System.out.println("PID: " + temp.processId + ", Waiting Time: " + temp.waitingTime + ", Turnaround Time: "
					+ temp.turnaroundTime);
			totalWaiting += temp.waitingTime;
			totalTurnaround += temp.turnaroundTime;
			temp = temp.next;
		} while (temp != head);

		System.out.println("\nAverage Waiting Time: " + (totalWaiting / processCount));
		System.out.println("Average Turnaround Time: " + (totalTurnaround / processCount));
	}
}
