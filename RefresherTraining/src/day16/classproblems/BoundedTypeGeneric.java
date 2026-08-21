package day16.classproblems;

public class BoundedTypeGeneric {
    public static <T extends Number> void display(T value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        display(5);
        display(5.5);
        display(7.88);
        display(6.98848248);
//        display("Anupam");
    }
}
