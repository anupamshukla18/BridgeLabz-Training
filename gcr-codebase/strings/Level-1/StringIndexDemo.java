import java.util.Scanner;
public class StringIndexDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        char ch = text.charAt(text.length());   // Accessing index beyond range
        System.out.println("Character: " + ch); // This line never executes
    }

    // Method to handle the exception using try-catch
    public static void handleException(String text) {
        System.out.println("\nHandling StringIndexOutOfBoundsException...");

        try {
            char ch = text.charAt(text.length());   // Risky statement
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled: You tried to access an index beyond string length.");
        }

        System.out.println("Program continues normally after handling exception...");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = sc.nextLine();

        // This will generate the exception and abruptly stop the program
        // Uncomment to observe crash behavior
        // generateException(text);

        // After observing exception, call handled method
        handleException(text);
    }
}
