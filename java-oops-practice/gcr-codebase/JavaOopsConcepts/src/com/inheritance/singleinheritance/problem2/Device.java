package com.inheritance.singleinheritance.problem2;

class Device {
	// instance variables
	String deviceId;
	String status; // ON / OFF

	// constructor
	Device(String deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}

	// display method
	void displayStatus() {
		System.out.println("Device ID: " + deviceId);
		System.out.println("Status: " + status);
	}
}