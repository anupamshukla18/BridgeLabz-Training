package com.trees.avltree.onlineticketbooking;

public class EventNode {
	int startTime; // e.g., 1430 means 2:30 PM
	String eventName;
	EventNode left, right;

	public EventNode(int startTime, String eventName) {
		this.startTime = startTime;
		this.eventName = eventName;
	}
}
