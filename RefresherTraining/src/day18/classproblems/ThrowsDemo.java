package day18.classproblems;

public class ThrowsDemo {
    public static void divide() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    public static void main(String[] args) throws ArithmeticException {
        try {
            divide();
        } catch (Exception e) {
            throw new ArithmeticException("Number cannot be divided by 0");
        }
    }
}
