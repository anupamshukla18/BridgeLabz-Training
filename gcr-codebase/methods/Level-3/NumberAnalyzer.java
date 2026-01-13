import java.util.Scanner;

public class NumberAnalyzer {
	// Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    // Method 1: Check Perfect Number
    // Perfect: sum of proper divisors == number
    public static boolean isPerfect(int number) {
        int sum = sumOfProperDivisors(number);
        return sum == number;
    }

    // Method 2: Abundant Number
    // Abundant: sum of proper divisors > number
    public static boolean isAbundant(int number) {
        int sum = sumOfProperDivisors(number);
        return sum > number;
    }

    // Method 3: Deficient Number
    // Deficient: sum of proper divisors < number
    public static boolean isDeficient(int number) {
        int sum = sumOfProperDivisors(number);
        return sum < number;
    }

    // Helper: Factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method 4: Strong Number
    // Strong: sum of factorial of digits == number
    public static boolean isStrong(int number) {
        int sum = 0;
        int n = number;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        return sum == number;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\n----- Results -----");

        System.out.println("Perfect Number: " + (isPerfect(number) ? "YES" : "NO"));
        System.out.println("Abundant Number: " + (isAbundant(number) ? "YES" : "NO"));
        System.out.println("Deficient Number: " + (isDeficient(number) ? "YES" : "NO"));
        System.out.println("Strong Number: " + (isStrong(number) ? "YES" : "NO"));
    }
}
