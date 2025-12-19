import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();   // User input

        // Check if number is a positive integer
        if (number <= 0) {
            System.out.println("Invalid Input! Please enter a positive integer.");
            input.close();
            return;  // Exit program
        }

        int factorial = 1;   // Variable to store factorial result
        int counter = 1;     // Counter for loop

        // While loop to calculate factorial
        while (counter <= number) {
            factorial = factorial * counter;
            counter++;
        }

        // Display result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
