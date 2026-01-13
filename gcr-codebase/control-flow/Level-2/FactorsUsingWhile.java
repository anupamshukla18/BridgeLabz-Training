import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();   // Take user input

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Invalid Input! Please enter a positive integer.");
            input.close();
            return;
        }

        System.out.println("The factors of " + number + " are:");

        int counter = 1;   // Initialize counter

        // While loop to check factors
        while (counter < number) {
            if (number % counter == 0) {   // Check divisibility
                System.out.println(counter);
            }
            counter++;   // Increment counter
        }
    }
}
