import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first, second;
        String op;

        // Get inputs
        System.out.print("Enter first number: ");
        first = input.nextDouble();

        System.out.print("Enter second number: ");
        second = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = input.next();      // read operator as string

        double result;

        // Switch based on operator
        switch (op) {

            case "+":
                result = first + second;
                System.out.println("Result = " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result = " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result = " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Division by zero is NOT allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
