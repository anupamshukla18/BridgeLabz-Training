package day12.hackerrankproblems.ReferenceVariableTrap;

public class DriverClass {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 5);
//      Rectangle rect2 = rect1;
		Rectangle rect2 = new Rectangle(rect1);

		rect1.displayRectangleDetails();
		rect2.scale(2);
		rect1.displayRectangleDetails();
	}
}