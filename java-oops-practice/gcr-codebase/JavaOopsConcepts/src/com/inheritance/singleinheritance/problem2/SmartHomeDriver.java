package com.inheritance.singleinheritance.problem2;

public class SmartHomeDriver {
	public static void main(String[] args) {
		// creating the object of thermostat
		Thermostat t = new Thermostat("TH-101", "ON", 24.5);
		t.displayStatus();
	}
}
