package day11.hackerrankproblems;
import java.util.*;

public class PdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {

        int maxHeight = 0;

        for (int i = 0; i < word.length(); i++) {

            // Convert character to index
            int index = word.charAt(i) - 'a';

            // Find tallest character
            maxHeight = Math.max(maxHeight, h.get(index));
        }

        // Width of each character = 1
        return maxHeight * word.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> h = new ArrayList<>();

        // Read 26 heights
        for (int i = 0; i < 26; i++) {
            h.add(sc.nextInt());
        }

        // Read the word
        String word = sc.next();

        int result = designerPdfViewer(h, word);

        System.out.println(result);

        sc.close();
    }
}