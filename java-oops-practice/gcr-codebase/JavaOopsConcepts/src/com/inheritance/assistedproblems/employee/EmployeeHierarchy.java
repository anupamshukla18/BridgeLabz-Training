package com.inheritance.assistedproblems.employee;

public class EmployeeHierarchy {
	public static void main(String[] args) {
		// creating employee object
		Employee e1 = new Employee("Vishal Yadav", 100, 85000);
		e1.display();
		// creating manager object
		Manager m1 = new Manager("Anuj Dwivedi", 101, 75000);
		m1.display();
		// creating employee object
		Developer d1 = new Developer("Utkarsh Mishra", 104, 50000);
		d1.display();
		// creating intern object
		Intern i1 = new Intern("Anupam Shukla", 121, 12000);
		i1.display();
	}
}
