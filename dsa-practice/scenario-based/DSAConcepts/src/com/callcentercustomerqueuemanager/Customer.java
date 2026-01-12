package com.callcentercustomerqueuemanager;

public class Customer implements Comparable<Customer> {
	private String id;
	private String name;
	private boolean isVIP;
	private int priority;

	public Customer(String id, String name, boolean isVIP, int priority) {
		this.id = id;
		this.name = name;
		this.isVIP = isVIP;
		this.priority = priority;
	}

	public String getId() {
		return id;
	}

	public boolean isVIP() {
		return isVIP;
	}

	@Override
	public int compareTo(Customer other) {
		return Integer.compare(other.priority, this.priority);
	}

	@Override
	public String toString() {
		return "Customer [ID=" + id + ", Name=" + name + ", VIP=" + isVIP + ", Priority=" + priority + "]";
	}
}
