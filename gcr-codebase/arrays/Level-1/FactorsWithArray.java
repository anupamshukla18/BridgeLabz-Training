import java.util.Scanner;

public class FactorsWithArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input! Enter a positive integer.");
            input.close();
            return;
        }

        int maxFactor = 10;                       // Initial array size
        int[] factors = new int[maxFactor];       // Factor array
        int index = 0;                            // Tracks next insert position

        // Loop to find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {    // Check factor

                // If array is full → Increase size
                if (index == maxFactor) {

                    // Double the size
                    maxFactor = maxFactor * 2;

                    // Temporary array
                    int[] temp = new int[maxFactor];

                    // Copy old data to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign temp back to factors
                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
