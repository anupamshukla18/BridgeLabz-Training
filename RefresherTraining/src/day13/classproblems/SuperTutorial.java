package day13.classproblems;

class Parents_01 {
	int number = 100;

	Parents_01() {
		System.out.println("Parent constructor called");
	}

	void display() {
		System.out.println("Parent display method");
	}
}

public class SuperTutorial extends Parents_01 {
	int number = 200;

	SuperTutorial() {
		super();
		System.out.println("Child constructor called");
	}

	void show() {
		System.out.println("Parent number: " + super.number);

		System.out.println("Child number: " + number);

		super.display();
	}

	public static void main(String[] args) {
		SuperTutorial object = new SuperTutorial();

		object.show();
	}
}