package day13.codingexercises;

class Shape {
	public double area() {
		return 0;
	}
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}
}

class Triangle extends Shape {
	double base;
	double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return 0.5 * base * height;
	}
}

public class ShapeHeirarchy {
	public static void main(String[] args) {

		Shape[] shapes = { new Circle(5), new Rectangle(10, 5), new Triangle(8, 6) };

		for (Shape shape : shapes) {
			System.out.println("Area: " + shape.area());
		}
	}
}