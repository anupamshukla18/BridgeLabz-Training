import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        double total = 0.0;      // To store the total sum
        double number = 0.0;     // To store each user input value

        System.out.println("Enter numbers to sum. Enter 0 to stop:");

        // Take the first input
        number = input.nextDouble();

        // Loop runs until user enters 0
        while (number != 0) {
            total = total + number;   // Add number to total

            // Ask for next number
            System.out.println("Enter next number (0 to stop):");
            number = input.nextDouble();
        }

        // Display the final total
        System.out.println("The total sum is: " + total);
    }
}
