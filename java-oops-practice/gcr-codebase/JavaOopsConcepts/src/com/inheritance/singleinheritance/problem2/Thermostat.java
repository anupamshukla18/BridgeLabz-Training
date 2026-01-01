package com.inheritance.singleinheritance.problem2;

class Thermostat extends Device {
	// instance variable
	double temperatureSetting;

	// constructor
	Thermostat(String deviceId, String status, double temperatureSetting) {
		super(deviceId, status); // calling Device constructor
		this.temperatureSetting = temperatureSetting;
	}

	// Overriding method to add more details
	void displayStatus() {
		super.displayStatus(); // prints device info
		System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	}
}
