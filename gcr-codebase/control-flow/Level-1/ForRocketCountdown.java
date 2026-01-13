import java.util.Scanner;

public class ForRocketCountdown {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask user to enter the countdown starting number
        System.out.print("Enter the starting number for countdown: ");
        int counter = input.nextInt();   // Store the user input in counter
        
        // While loop runs until counter becomes 0
        for (int i = counter; i >= 1; i--) {
			System.out.println(counter);
			counter--;
		}

        // After countdown completes
        System.out.println("Rocket Launched!");
    }
}
