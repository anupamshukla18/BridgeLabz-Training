package com.inheritance.assistedproblems.employee;

class Developer extends Employee {
	public Developer(String name, int id, int salary) {
		super(name, id, salary);
	}

	// details display
	void display() {
		System.out.println(
				"\nName of the Developer: " + this.name + "\nDeveloper ID: " + this.id + "\nDeveloper salary: " + this.salary);
	}
}