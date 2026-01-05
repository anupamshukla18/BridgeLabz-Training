package com.linkedlist.circular.roundrobinalgo;

class ProcessNode {
	int processId;
	int burstTime;
	int remainingTime;
	int priority;
	int waitingTime;
	int turnaroundTime;
	ProcessNode next;

	public ProcessNode(int processId, int burstTime, int priority) {
		this.processId = processId;
		this.burstTime = burstTime;
		this.remainingTime = burstTime;
		this.priority = priority;
		this.waitingTime = 0;
		this.turnaroundTime = 0;
		this.next = null;
	}
}
