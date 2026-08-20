package day15.classproblems;

class Box<T> {
    T input;

    void display() {
        System.out.println(input);
    }
}
public class BoxMain {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.input = "Anupam";
        b1.display();

    }
}
