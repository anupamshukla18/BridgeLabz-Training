import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check valid positive integer greater than 1
        if (number <= 1) {
            System.out.println("Invalid Input! Enter a number greater than 1.");
            input.close();
            return;
        }

        int greatestFactor = 1;          // To store greatest factor
        int counter = number - 1;        // Start from number - 1

        // While loop to find greatest factor
        while (counter >= 1) {
            if (number % counter == 0) {  // Check divisibility
                greatestFactor = counter;
                break;                    // Stop when first (greatest) factor found
            }
            counter--;
        }

        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
    }
}
