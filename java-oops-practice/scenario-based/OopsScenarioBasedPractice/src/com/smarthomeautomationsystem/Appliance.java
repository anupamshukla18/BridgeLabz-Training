package com.smarthomeautomationsystem;

class Appliance {
	protected String applianceName;

	// Internal state hidden (Encapsulation)
	private boolean powerStatus;
	private int energyUsage; // watts

	// Constructor with default energy usage
	public Appliance(String applianceName) {
		this.applianceName = applianceName;
		this.energyUsage = 100; // default
	}

	// Constructor with user-defined energy usage
	public Appliance(String applianceName, int energyUsage) {
		this.applianceName = applianceName;
		this.energyUsage = energyUsage;
	}

	// Protected methods for subclasses
	protected void setPowerStatus(boolean status) {
		this.powerStatus = status;
	}

	protected int getEnergyUsage() {
		return energyUsage;
	}

	public boolean isOn() {
		return powerStatus;
	}
}
