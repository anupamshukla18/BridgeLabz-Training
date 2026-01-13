import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results (6,7,8,9 → total 4 results)
        int[] multiplicationResult = new int[4];

        int index = 0;

        // Calculate multiplication table from 6 to 9 and store in array
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Display the results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}
