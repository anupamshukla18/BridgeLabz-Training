import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is NOT a Prime Number");
            input.close();
            return;
        }

        boolean isPrime = true;   // Assume number is prime

        // Check divisibility from 2 to number-1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {   // If divisible, not prime
                isPrime = false;
                break;               // Exit loop early
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}
