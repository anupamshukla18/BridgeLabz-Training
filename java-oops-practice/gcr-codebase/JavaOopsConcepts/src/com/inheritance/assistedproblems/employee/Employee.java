package com.inheritance.assistedproblems.employee;

public class Employee {
		// instance variable
		protected String name;
		protected int id;
		protected int salary;

		// constructor
		public Employee(String name, int id, int salary) {
			this.name = name;
			this.id = id;
			this.salary = salary;
		}

		// details display
		void display() {
			System.out.println(
					"\nName of the employee: " + this.name + "\nEmployee ID: " + this.id + "\nEmployee salary: " + this.salary);
		}
	}

