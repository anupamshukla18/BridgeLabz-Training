package day15.classproblems;

interface Person {
	void walk();
}

interface Student extends Person {
	void study();
}

class CollegeStudent implements Student {

	public void walk() {
		System.out.println("Person is walking");
	}

	public void study() {
		System.out.println("Student is studying");
	}
}

public class ExtendingAnInterface {
	public static void main(String[] args) {

		CollegeStudent student = new CollegeStudent();

		student.walk();
		student.study();
	}
}