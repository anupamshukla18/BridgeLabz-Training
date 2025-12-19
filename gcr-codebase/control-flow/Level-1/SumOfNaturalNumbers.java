import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number n: ");
        int n = input.nextInt();   // Take user input

        // Check if n is a natural number
        if (n <= 0) {
            System.out.println("Invalid Input! Please enter a Natural Number (greater than 0).");
            input.close();
            return;   // Exit program
        }

        // Compute sum using formula n*(n+1)/2
        int formulaSum = n * (n + 1) / 2;

        // Compute sum using while loop
        int sum = 0;
        int counter = 1;

        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }

        // Display both results
        System.out.println("Sum using formula n*(n+1)/2 = " + formulaSum);
        System.out.println("Sum using while loop        = " + sum);

        // Compare results
        if (sum == formulaSum) {
            System.out.println("Both results are SAME. Computation is correct!");
        } else {
            System.out.println("Results are NOT matching. Please check the logic.");
        }
    }
}
