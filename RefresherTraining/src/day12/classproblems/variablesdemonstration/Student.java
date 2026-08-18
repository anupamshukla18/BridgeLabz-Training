package day12.classproblems.variablesdemonstration;

public class Student {

	String name; // Instance variable
	int rollNumber; // Instance variable

	static String college = "TIT&S"; // Static variable

	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("College: " + college);
		System.out.println();
	}
}