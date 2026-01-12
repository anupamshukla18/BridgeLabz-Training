package com.callcentercustomerqueuemanager;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallQueueManager {
	private Queue<Customer> normalQueue = new LinkedList<>();
	private PriorityQueue<Customer> vipQueue = new PriorityQueue<>();

	public void addCustomer(Customer customer) {
		if (customer.isVIP()) {
			vipQueue.offer(customer);
		} else {
			normalQueue.offer(customer);
		}
	}

	public Customer getNextCustomer() {
		if (!vipQueue.isEmpty()) {
			return vipQueue.poll();
		} else {
			return normalQueue.poll();
		}
		
	}
}
