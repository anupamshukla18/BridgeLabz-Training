import java.util.Scanner;
public class NumberFormatDemo {
	// Method to generate NumberFormatException (without handling)
    public static void generateException(String text) {
        System.out.println("Generating NumberFormatException...");
        
        int number = Integer.parseInt(text);   // Throws NumberFormatException if text is not numeric
        System.out.println("Number: " + number);  // This will not execute if exception occurs
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        System.out.println("\nHandling NumberFormatException...");

        try {
            int number = Integer.parseInt(text);  // Risky code
            System.out.println("Number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: Input is not a valid number.");
        } 
        catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }

        System.out.println("Program continues normally after handling exception...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String value: ");
        String text = sc.nextLine();

        // First: Uncomment to see program crash
        // generateException(text);

        // Then: call handled method
        handleException(text);
    }
}
