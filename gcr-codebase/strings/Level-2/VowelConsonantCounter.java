import java.util.Scanner;
public class VowelConsonantCounter {
    // Method to check whether a character is vowel, consonant or not a letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII if needed
        if (ch >= 'A' && ch <= 'Z') {  
            ch = (char)(ch + 32);     
        }

        // Check if it is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' 
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "NotALetter";
    }

    // Method to count vowels and consonants
    // Returns int[2] → [vowelCount, consonantCount]
    public static int[] findVowelsConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowels++;
            } 
            else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        int[] result = findVowelsConsonants(text);

        System.out.println("\nTotal Vowels     : " + result[0]);
        System.out.println("Total Consonants : " + result[1]);
    }
}
