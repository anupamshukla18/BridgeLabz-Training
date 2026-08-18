package day13.classproblems;

class Parent {
	static void display() {
		System.out.println("Parent display method");
	}
}

class MethodHiding extends Parent {
	static void display() {
		System.out.println("Child display method");
	}
	public static void main(String[] args) {
		Parent parent = new MethodHiding();
		parent.display();

		MethodHiding child = new MethodHiding();
		child.display();
	}
}
