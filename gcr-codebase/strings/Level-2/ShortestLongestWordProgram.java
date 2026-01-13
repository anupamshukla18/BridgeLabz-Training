import java.util.Scanner;
public class ShortestLongestWordProgram {
    // Method to find length of string without using length()
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) { }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        int len = customLength(text);
        int wordCount = 0;
        boolean inWord = false;

        // Count words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        // Extract words
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

    // Method to create 2D array [word][length]
    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(customLength(words[i]));
        }
        return table;
    }

    // Method to find shortest & longest words
    // Returns int[2] → [shortestIndex, longestIndex]
    public static int[] findShortestLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);
            int shortestLength = Integer.parseInt(table[shortestIndex][1]);
            int longestLength = Integer.parseInt(table[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Split words
        String[] words = customSplit(text);

        // Create 2D table
        String[][] table = getWordLengthTable(words);

        // Find shortest and longest
        int[] result = findShortestLongest(table);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        // Display Output
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + Integer.parseInt(table[i][1]));
        }

        System.out.println("\nShortest Word  : " + table[shortestIndex][0] +
                           " (Length = " + Integer.parseInt(table[shortestIndex][1]) + ")");

        System.out.println("Longest Word   : " + table[longestIndex][0] +
                           " (Length = " + Integer.parseInt(table[longestIndex][1]) + ")");

        sc.close();
    }
}
