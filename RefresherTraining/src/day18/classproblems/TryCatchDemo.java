package day18.classproblems;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0");
        }
        System.out.println("Program executed");
    }
}
