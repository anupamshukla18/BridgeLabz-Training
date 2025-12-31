package com.inheritance.assistedproblems.employee;

class Manager extends Employee {
	int teamSize;

	public Manager(String name, int id, int salary, int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}

	// details display
	void display() {
		System.out.println("\nName of the Manager: " + this.name + "\nManager ID: " + this.id + "\nManger salary: "
				+ this.salary + "\nTeam size: " + teamSize);
	}
}