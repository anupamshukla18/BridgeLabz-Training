package day13.classproblems;

class Parent {
	void display() {
		System.out.println("Parent display method");
	}
}

public class MethodOverriding extends Parent {
	@Override
	void display() {
		System.out.println("Child display method");
	}

	public static void main(String[] args) {
		MethodOverriding object = new MethodOverriding();

		object.display();
	}
}