package com.callcentercustomerqueuemanager;

import java.util.HashMap;

public class CallTracker {
	private HashMap<String, Integer> callCount = new HashMap<>();

	public void recordCall(String customerId) {
		callCount.put(customerId, callCount.getOrDefault(customerId, 0) + 1);
	}

	public void showCallCounts() {
		System.out.println("Monthly Call Count:");
		callCount.forEach((k, v) -> System.out.println("Customer ID: " + k + " → Calls: " + v));
	}
}
