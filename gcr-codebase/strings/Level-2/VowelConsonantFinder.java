import java.util.Scanner;
public class VowelConsonantFinder {
    // Method to return type of character
    public static String getCharacterType(char ch) {

        // Check if uppercase letter using ASCII and convert to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);   // Convert to lowercase using ASCII
        }

        // Check if lowercase alphabet
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to process string and return 2D array
    public static String[][] findVowelsAndConsonants(String text) {
        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharacterType(ch);
        }

        return result;
    }

    // Method to display result in tabular format
    public static void displayResult(String[][] arr) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("--------------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-15s\n", arr[i][0], arr[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findVowelsAndConsonants(text);

        displayResult(result);
    }
}
