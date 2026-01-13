package com.homenest;

class Lock extends Device {

	Lock(String id) {
		super(id, 0.2);
	}

	public void reset() {
		System.out.println("Lock reset: Security codes refreshed");
		firmwareLog();
	}
}
