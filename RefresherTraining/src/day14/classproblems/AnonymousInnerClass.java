package day14.classproblems;

interface Vehicle {
	void start();
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Vehicle v = new Vehicle() {
			@Override
			public void start() {
				System.out.println("Vehicle is Starting!!");
			}
		};
		v.start();
	}
}
