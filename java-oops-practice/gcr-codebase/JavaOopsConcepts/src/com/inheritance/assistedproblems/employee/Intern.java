package com.inheritance.assistedproblems.employee;

class Intern extends Employee {
	public Intern(String name, int id, int salary) {
		super(name, id, salary);
	}

	// details display
	void display() {
		System.out.println(
				"\nName of the Intern: " + this.name + "\nIntern ID: " + this.id + "\nIntern salary: " + this.salary);
	}
}