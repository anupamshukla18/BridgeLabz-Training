package day18.classproblems;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println(19 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0");
        } finally {
            System.out.println("Program executed");
        }
    }
}
