package day14.classproblems;

interface Vehicles {
	void start();
}
 
public class AnonymousInnerClass {
	public static void main(String[] args) {
		Vehicles v = new Vehicles() {
			@Override
			public void start() {
				System.out.println("Vehicle is Starting!!");
			}
		};
		v.start();
	}
}
