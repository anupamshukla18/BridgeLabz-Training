package day12.classproblems.variablesdemonstration;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Anupam", 101);
		Student student2 = new Student("Rahul", 102);

		student1.display();
		student2.display();

		student1.name = "Aman";
		Student.college = "TIT";

		student1.display();
		student2.display();
	}
}