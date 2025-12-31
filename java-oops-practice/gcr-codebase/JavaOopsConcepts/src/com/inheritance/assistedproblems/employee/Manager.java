package com.inheritance.assistedproblems.employee;

class Manager extends Employee {
	public Manager(String name, int id, int salary) {
		super(name, id, salary);
	}

	// details display
	void display() {
		System.out.println(
				"\nName of the Manager: " + this.name + "\nManager ID: " + this.id + "\nManger salary: " + this.salary);
	}
}