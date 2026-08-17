package day12.hackerrankproblems.ReferenceVariableTrap;

public class Rectangle {
	// Instance variables
	int length;
	int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(Rectangle r) {
		this.length = r.length;
		this.width = r.width;
	}

	// scale()
	public void scale(int factor) {
		this.length = length * factor;
		this.width = width * factor;
	}

	public void displayRectangleDetails() {
		System.out.println("Length: " + this.length);
		System.out.println("Width: " + this.width);
		System.out.println("----------------------");
	}
}
