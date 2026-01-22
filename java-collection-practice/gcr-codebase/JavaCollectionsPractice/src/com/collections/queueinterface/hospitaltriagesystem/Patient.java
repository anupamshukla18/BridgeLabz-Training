package com.collections.queueinterface.hospitaltriagesystem;

class Patient implements Comparable<Patient> {
	String name;
	int severity;

	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}

	// Higher severity should come first
	@Override
	public int compareTo(Patient other) {
		return other.severity - this.severity;
	}

	@Override
	public String toString() {
		return name + " (" + severity + ")";
	}
}