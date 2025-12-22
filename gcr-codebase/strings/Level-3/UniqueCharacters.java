import java.util.Scanner;
public class UniqueCharacters {
    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);  // when index goes out of range -> exception
                count++;
            }
        } catch (Exception e) {
            // stop when exception occurs
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);

        char[] unique = new char[len];  // temp array to store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // check if character appeared earlier
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Create final array with exact unique size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Method to display result
    public static void display(char[] arr) {
        System.out.print("Unique Characters: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);

        display(uniqueCharacters);
    }
}
