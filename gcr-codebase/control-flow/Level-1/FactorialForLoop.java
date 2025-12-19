import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();   // Take input

        // Check for natural number
        if (number <= 0) {
            System.out.println("Invalid Input! Please enter a positive integer.");
            input.close();
            return;   // Exit if not natural number
        }

        int factorial = 1;

        // Compute factorial using for loop
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        // Display result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
