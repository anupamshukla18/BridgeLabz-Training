package day13.classproblems;

class Parents {
    void display() {
        System.out.println("Parent display method");
    }
}

public class MethodOverriding extends Parents {
    @Override
    void display() {
        System.out.println("Child display method");
    }

    public static void main(String[] args) {
        MethodOverriding object = new MethodOverriding();

        object.display();
    }
}