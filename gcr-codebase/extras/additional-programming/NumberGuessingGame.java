import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    // Generates a guess within current range
    public static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }

    // Gets feedback from the user
    public static String getFeedback(int guess) {
        System.out.print("Is the guess high, low, or correct? : ");
        return scanner.next().toLowerCase();
    }

    public static void main(String[] args) {
        
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("Reply with: high | low | correct\n");

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("My Guess: " + guess);

            feedback = getFeedback(guess);

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("YAY! I guessed your number correctly!");
                break;
            } else {
                System.out.println("Invalid input! Please type: high / low / correct");
            }

            if (low > high) {
                System.out.println("Something went wrong... Did you give correct hints?");
                break;
            }
        }
    }
}
