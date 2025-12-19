import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;   // To store total sum
        double number;        // To store user input

        System.out.println("Enter numbers to sum (0 or negative number to stop):");

        // Infinite loop
        while (true) {
            number = input.nextDouble();   // Take input

            // Check if number is 0 or negative, then stop
            if (number <= 0) {
                break;   // Exit loop
            }

            total = total + number;  // Add to total
        }

        // Display final result
        System.out.println("The total sum is: " + total);
    }
}
