import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid Input! Please enter a positive integer.");
            input.close();
            return;
        }

        // Create String array to store results
        String[] result = new String[number];

        // FizzBuzz logic and store in array
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            }
            else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            }
            else {
                result[i - 1] = String.valueOf(i);
            }
        }

        // Display results from array
        System.out.println("\n--- FizzBuzz Result ---");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }
    }
}
