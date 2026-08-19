package day14.classproblems.encapsulationexample;

public class DriverClass {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Anupam", 80.9);
		s1.setName("Anuj");
		
		s1.display();
	}
}
 