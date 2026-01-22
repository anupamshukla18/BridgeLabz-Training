package com.collections.mapinterface.groupbydepartment;

class Employee {
	private String name;
	private Department department;

	public Employee(String name, Department department) {
		this.name = name;
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}

enum Department {
	HR, IT
}
