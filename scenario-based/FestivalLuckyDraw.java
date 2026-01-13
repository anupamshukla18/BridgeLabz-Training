/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter lucky draw number (or -1 to exit): ");

            // Validate input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number only.");
                sc.next(); // clear wrong input
                continue;  // skip this iteration
            }

            int number = sc.nextInt();

            if (number == -1) {
                System.out.println("Lucky Draw Closed. Happy Diwali");
                break;
            }

            // Check divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift!");
            } else {
                System.out.println("Better luck next time");
            }

            System.out.println("--------------------------");
        }

        sc.close();
    }
}
