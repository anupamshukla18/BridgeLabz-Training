package com.callcentercustomerqueuemanager;

public class CallCenterService {
	private CallQueueManager queueManager;
	private CallTracker callTracker;

	public CallCenterService() {
		queueManager = new CallQueueManager();
		callTracker = new CallTracker();
	}

	public void receiveCall(Customer customer) {
		callTracker.recordCall(customer.getId());
		queueManager.addCustomer(customer);
		System.out.println("Call registered.");
	}

	public void serveCall() {
		Customer customer = queueManager.getNextCustomer();
		if (customer != null) {
			System.out.println("Serving: " + customer);
		} else {
			System.out.println("No calls in queue.");
		}
	}

	public void showStatistics() {
		callTracker.showCallCounts();
	}
}
