package day18.classproblems;

class InnerExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            throw new RuntimeException(
                    "Calculation failed",
                    e
            );
        }
    }
}