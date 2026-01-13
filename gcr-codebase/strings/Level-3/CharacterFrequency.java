import java.util.Scanner;
public class CharacterFrequency {
    // Method to find frequency of characters using charAt()
    public static String[][] findCharFrequency(String text) {

        int[] freq = new int[256];   // frequency array for ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count how many unique characters are present
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; 
                // Mark counted so it isn't counted again
            }
        }

        // Create 2D array -> [character , frequency]
        String[][] result = new String[uniqueCount][2];

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] < 0) {    // negative means not yet stored
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(-freq[ch]); 
                freq[ch] = 0;     // reset to avoid duplicate insertion
                index++;
            }
        }

        return result;
    }

    // Display Method
    public static void display(String[][] arr) {
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("---------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-10s\n", arr[i][0], arr[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencyTable = findCharFrequency(text);

        display(frequencyTable);
    }
}
