// Writing Java Code to find quotient and remainder
import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        // Creating variables
        int number1, number2;

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        // Calculations
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Displaying result
        System.out.println("The Quotient is " + quotient +
                           " and Reminder is " + remainder +
                           " of two number " + number1 + " and " + number2);

        input.close(); // Closing the Scanner object
    }
}