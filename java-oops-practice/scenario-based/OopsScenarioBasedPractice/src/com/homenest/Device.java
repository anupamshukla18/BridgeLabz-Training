package com.homenest;

// Base class for all devices
abstract class Device implements IControllable {
	protected String deviceId;
	private boolean status; // Encapsulation
	protected double energyUsage;

	// Constructor
	Device(String deviceId, double energyUsage) {
		this.deviceId = deviceId;
		this.energyUsage = energyUsage;
		this.status = false;
	}

	// Turn ON device
	public void turnOn() {
		status = true;
		System.out.println(deviceId + " turned ON");
	}

	// Turn OFF device
	public void turnOff() {
		status = false;
		System.out.println(deviceId + " turned OFF");
	}

	// Energy calculation using operator
	public double calculateEnergy(int hours) {
		return energyUsage * hours;
	}

	// Secure firmware log
	protected void firmwareLog() {
		System.out.println("Firmware log updated for " + deviceId);
	}

	// Polymorphic method
	public abstract void reset();
}
