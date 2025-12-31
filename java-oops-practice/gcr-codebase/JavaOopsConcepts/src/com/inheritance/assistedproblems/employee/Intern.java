package com.inheritance.assistedproblems.employee;

class Intern extends Employee {
	int totalTasks;

	public Intern(String name, int id, int salary, int totalTasks) {
		super(name, id, salary);
		this.totalTasks = totalTasks;
	}

	// details display
	void display() {
		System.out.println("\nName of the Intern: " + this.name + "\nIntern ID: " + this.id + "\nIntern salary: "
				+ this.salary + "\nTotal tasks: " + totalTasks);
	}
}