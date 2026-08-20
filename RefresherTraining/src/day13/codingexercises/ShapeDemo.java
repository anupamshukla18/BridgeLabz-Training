package day13.codingexercises;
class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Shape2D extends Shapes {
    void draw() {
        System.out.println("Drawing a 2D shape");
    }

    void draw(String color) {
        System.out.println("Drawing a 2D shape in " + color + " color");
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Shape2D shape = new Shape2D();

        shape.draw();
        shape.draw("Red");
    }
}