import java.util.Scanner;
public class ReplaceWordInSentence {
	public static String replaceWord(String sentence, String oldWord, String newWord) {
        StringBuilder result = new StringBuilder();
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Build each word character by character
            if (ch != ' ') {
                word += ch;
            } else {
                // If word matches → replace
                if (word.equals(oldWord)) {
                    result.append(newWord);
                } else {
                    result.append(word);
                }
                result.append(" ");
                word = "";
            }
        }

        // Handle last word
        if (word.equals(oldWord)) {
            result.append(newWord);
        } else {
            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated Sentence: " + result); 
    }
}
