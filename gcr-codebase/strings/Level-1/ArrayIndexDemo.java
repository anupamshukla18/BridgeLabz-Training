import java.util.Scanner;
public class ArrayIndexDemo {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");

        // Access index larger than array size
        System.out.println("Accessing element: " + names[names.length]);  
        // This line will never execute if exception occurs
        System.out.println("Successfully accessed element.");
    }

    // Method to handle the exception using try-catch
    public static void handleException(String[] names) {
        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");

        try {
            System.out.println("Accessing element: " + names[names.length]);  
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: Index is out of array range.");
        }
        catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }

        System.out.println("Program continues normally after handling exception...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine();  // Consume newline

        String[] names = new String[size];

        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        // First: Uncomment to see program crash without handling
        // generateException(names);

        // Then: call handled method
        handleException(names);
    }
}
