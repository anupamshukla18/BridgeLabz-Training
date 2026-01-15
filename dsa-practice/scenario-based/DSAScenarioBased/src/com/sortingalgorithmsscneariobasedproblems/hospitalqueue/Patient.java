package com.sortingalgorithmsscneariobasedproblems.hospitalqueue;

public class Patient {
	String name;
	int criticality; // from 1 to 10
	
	public Patient(String name, int criticality) {
		this.name = name;
		this.criticality = criticality;
	}
	
	// displaying patient details
	void display() {
		System.out.println(name + " - Criticality: " + criticality);
	}
}
