import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;   // To store sum of divisors

        // Sum all proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {   // Check divisibility
                sum = sum + i;
            }
        }

        // Check Abundant condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }
    }
}
