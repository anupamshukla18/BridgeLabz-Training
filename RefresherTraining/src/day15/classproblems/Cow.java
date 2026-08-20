package day15.classproblems;

interface Animal {
	void eat();
}

class Cow implements Animal {
	@Override
	public void eat() {
		System.out.println("Cow is vegetarian and is a herbivores!!");
	}
	
	public static void main(String[] args) {
		Animal a = new Cow();
		a.eat();
	}
}
