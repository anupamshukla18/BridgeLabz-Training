public class NullPointerDemo {
    // Method to generate NullPointerException
    public static void generateNullPointer() {
        String text = null;          // text is null
        System.out.println(text.length());   // Accessing method on null → NPE
    }

    // Method to handle NullPointerException
    public static void handleNullPointer() {
        String text = null;          // text is null

        try {
            System.out.println(text.length());   // Risky statement
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled: You tried to access a method on a null object.");
        }

        System.out.println("Program continues normally after handling exception...");
    }

    public static void main(String[] args) {

        // First: This will generate the exception and crash if not commented
        // Uncomment to see exception without handling
        // generateNullPointer();

        // After observing exception, refactor to call handled method
        handleNullPointer();
    }
}
