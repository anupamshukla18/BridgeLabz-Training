import java.util.Scanner;
public class FrequencyUsingUniqueCharacters {
    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // check if char appeared earlier
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // create exact-size unique array
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find character frequency using unique characters
    public static String[][] characterFrequency(String text) {

        int[] freq = new int[256];   // ASCII frequency array

        // count frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // get unique chars
        char[] unique = uniqueCharacters(text);

        // create 2D array [char , frequency]
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            char ch = unique[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    // display result
    public static void display(String[][] arr) {
        System.out.println("\nCharacter Frequency:");
        System.out.println("--------------------------");
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("--------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-10s\n", arr[i][0], arr[i][1]);
        }
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencyTable = characterFrequency(text);

        display(frequencyTable);
    }
}
