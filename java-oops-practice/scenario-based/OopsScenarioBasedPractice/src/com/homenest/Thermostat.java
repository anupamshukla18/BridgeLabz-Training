package com.homenest;

class Thermostat extends Device {

	Thermostat(String id) {
		super(id, 2.0);
	}

	public void reset() {
		System.out.println("Thermostat reset: Temperature set to 24°C");
		firmwareLog();
	}
}
