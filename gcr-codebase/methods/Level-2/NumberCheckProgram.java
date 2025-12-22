import java.util.Scanner;

public class NumberCheckProgram {
	// Method to check whether number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2
    // Returns 0 if equal
    // Returns -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Take input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\n--- Number Check Result ---");

        // Loop and check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");

                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[4]);

        System.out.println("\n--- Comparison of First and Last Elements ---");
        if (result == 1) {
            System.out.println("First element (" + numbers[0] + ") is GREATER than last element (" + numbers[4] + ")");
        } else if (result == 0) {
            System.out.println("First element and last element are EQUAL");
        } else {
            System.out.println("First element (" + numbers[0] + ") is LESS than last element (" + numbers[4] + ")");
        }
    }
}
