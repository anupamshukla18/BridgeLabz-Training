import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 1) {
            System.out.println("Invalid Input! Enter a number greater than 1.");
            input.close();
            return;
        }

        int greatestFactor = 1;   // Initialize to 1

        // Loop from (number-1) down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {     // Check perfect divisibility
                greatestFactor = i;    // Store greatest factor
                break;                 // Stop loop since we found the greatest factor
            }
        }

        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
    }
}
