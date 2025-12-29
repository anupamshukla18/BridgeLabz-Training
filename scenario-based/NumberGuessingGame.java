import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
	public static void main(String[] args) {
		// Creating a scanner object
		Scanner input = new Scanner(System.in);
		// Creating a random object
		Random random = new Random();
		
		// Taking a random number
		int number = random.nextInt(100) + 1;
		
		// Intializing the maximum attempts and the count
		int maxAttempts = 5;
		int count = 0;
		
		System.out.println("Welcome to the number guessing game!!" +
							"\nYou have 5 Attempts to guess the number" +
							"\nThe number is between 1 and 100"); 
							
		// Checking if the user has guessed the right number or not
		do {
			System.out.println("Enter your guess: ");
			int guess = input.nextInt();
			count++;
			
			if (number > guess) {
				System.out.println("Too Low!!");
			} else if (number < guess) {
				System.out.println("Too High!!");
			} else {
				System.out.println("You've guessed the correct number " + number);
				return;
			} 
		} while (count < maxAttempts);
		
		// Printing the number 
		System.out.println("Game Over! the number was " + number);
		
		input.close();
	}
}