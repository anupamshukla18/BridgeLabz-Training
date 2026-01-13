import java.util.Scanner;
public class TextWordLength2D {
    // Method to find length of a String without using length()
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to split text into words without split()
    public static String[] customSplit(String text) {
        int len = customLength(text);
        int wordCount = 0;
        boolean inWord = false;

        // Count number of words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                if (start != i) {
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

    // Method to create 2D array of words and their lengths
    public static String[][] getWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];                             // word
            table[i][1] = String.valueOf(customLength(words[i])); // length as String
        }

        return table;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Step 1: Split text using user defined method
        String[] words = customSplit(text);

        // Step 2: Prepare 2D table
        String[][] result = getWordLengthTable(words);

        // Step 3: Display result in tabular form
        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");

        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];
            int length = Integer.parseInt(result[i][1]); // convert String to int
            System.out.println(word + "\t\t" + length);
        }
    }
}
