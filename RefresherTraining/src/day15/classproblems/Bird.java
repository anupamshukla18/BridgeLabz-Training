package day15.classproblems;

class Animals {
	void eat() {
		System.out.println("Animal is eating");
	}
}

interface Flyable {
	void fly();
}

class Bird extends Animals implements Flyable {
	public void fly() {
		System.out.println("Bird is flying");
	}

	public static void main(String[] args) {
		Bird bird = new Bird();

		bird.eat();
		bird.fly();
	}
}