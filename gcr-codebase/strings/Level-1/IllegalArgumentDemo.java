import java.util.Scanner;
public class IllegalArgumentDemo {
    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        System.out.println("Generating IllegalArgumentException...");
        // start index > end index -> IllegalArgumentException
        String result = text.substring(5, 2);
        System.out.println("Substring: " + result);   // This will not execute
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        System.out.println("\nHandling IllegalArgumentException...");

        try {
            // start index > end index -> IllegalArgumentException
            String result = text.substring(5, 2);
            System.out.println("Substring: " + result);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: Start index cannot be greater than end index.");
        } 
        catch (RuntimeException e) {   // Generic Runtime Exception handling
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }

        System.out.println("Program continues normally after handling exception...");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = sc.nextLine();

        // First: Uncomment to see program crash without handling
        // generateException(text);

        // Then: Call handled method
        handleException(text);
    }
}
