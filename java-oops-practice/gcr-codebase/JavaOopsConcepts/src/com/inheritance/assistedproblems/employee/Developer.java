package com.inheritance.assistedproblems.employee;

class Developer extends Employee {
	String programmingLanguage;

	public Developer(String name, int id, int salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}

	// details display
	void display() {
		System.out.println("\nName of the Developer: " + this.name + "\nDeveloper ID: " + this.id
				+ "\nDeveloper salary: " + this.salary + "\nProgramming Language: " + this.programmingLanguage);
	}
}