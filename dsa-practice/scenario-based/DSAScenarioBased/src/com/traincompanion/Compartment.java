package com.traincompanion;

class Compartment {

	String name; // Compartment name (Sleeper, Pantry, etc.)
	boolean hasWifi; // Service availability
	boolean hasPantry;

	Compartment prev; // Previous compartment
	Compartment next; // Next compartment

	// Constructor
	Compartment(String name, boolean hasWifi, boolean hasPantry) {
		this.name = name;
		this.hasWifi = hasWifi;
		this.hasPantry = hasPantry;
		this.prev = null;
		this.next = null;
	}
}
