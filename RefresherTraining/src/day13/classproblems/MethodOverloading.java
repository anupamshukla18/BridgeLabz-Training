package day13.classproblems;

class MethodOverloading {
	void display() {
		System.out.println("No arguments");
	}

	void display(int number) {
		System.out.println("Number: " + number);
	}

	void display(String name) {
		System.out.println("Name: " + name);
	}

	void display(int number, String name) {
		System.out.println("Number: " + number + ", Name: " + name);
	}

	public static void main(String[] args) {
		MethodOverloading object = new MethodOverloading();

		object.display();
		object.display(10);
		object.display("Anupam");
		object.display(10, "Anupam");
	}
}