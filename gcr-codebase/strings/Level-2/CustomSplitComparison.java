import java.util.Scanner;
public class CustomSplitComparison {
    // Method to find string length without using length()
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // charAt throws exception when index goes out of range
        }
        return count;
    }

    // Method to split string without using split()
    public static String[] customSplit(String text) {
        int len = customLength(text);

        // 1️⃣ Count number of words (words separated by spaces)
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                if (start != i) { // avoid multiple spaces
                    String word = "";
                    for (int j = start; j < i; j++) {
                        word += text.charAt(j);
                    }
                    words[index++] = word;
                }
                start = i + 1;
            }
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // User defined split
        String[] customWords = customSplit(text);

        // Built-in split
        String[] builtInWords = text.trim().split("\\s+");

        // Compare
        boolean result = compareArrays(customWords, builtInWords);

        // Display Result
        System.out.println("\nCustom Split Result:");
        for (String w : customWords)
            System.out.println(w);

        System.out.println("\nBuilt-in Split Result:");
        for (String w : builtInWords)
            System.out.println(w);

        System.out.println("\nAre both results same? " + result);
    }
}
