package day12.hackerrankproblems.copyconstructorfornestedobject;

public class Main {

	public static void main(String[] args) {

		Address address = new Address("MG Road", "Bhopal", 462001);

		Student originalStudent = new Student("Anupam", address);
		Student copiedStudent = new Student(originalStudent);

		copiedStudent.address.city = "Indore";

		System.out.println("Original Student City: " + originalStudent.address.city);

		System.out.println("Copied Student City: " + copiedStudent.address.city);
	}
}