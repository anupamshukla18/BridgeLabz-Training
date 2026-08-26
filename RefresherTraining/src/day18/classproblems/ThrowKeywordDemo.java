package day18.classproblems;

public class ThrowKeywordDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot be divided by 0");
        }

        System.out.println("Program executed");
    }
}
