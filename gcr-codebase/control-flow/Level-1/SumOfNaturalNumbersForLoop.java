import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Natural Number n: ");
        int n = input.nextInt();   // Take user input

        // Check if n is a Natural Number
        if (n <= 0) {
            System.out.println("Invalid Input! Please enter a Natural Number (greater than 0).");
            input.close();
            return;   // Exit program
        }

        // Compute using formula n*(n+1)/2
        int formulaSum = n * (n + 1) / 2;

        // Compute sum using for loop
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        // Print both results
        System.out.println("Sum using formula n*(n+1)/2 = " + formulaSum);
        System.out.println("Sum using for loop         = " + sum);

        // Compare both results
        if (sum == formulaSum) {
            System.out.println("Both results are SAME. Computation is correct!");
        } else {
            System.out.println("Results are NOT matching. Please check the logic.");
        }
    }
}
