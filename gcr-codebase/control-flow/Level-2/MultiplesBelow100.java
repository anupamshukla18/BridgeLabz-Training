import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();   // Take user input

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid Input! Please enter a positive integer less than 100.");
            input.close();
            return;
        }

        System.out.println("Multiples of " + number + " below 100 are:");

        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {   // Check if i is multiple
                System.out.println(i);
            }
        }

        input.close();
    }
}
