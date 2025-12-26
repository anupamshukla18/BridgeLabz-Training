import java.util.Scanner;
public class MostFrequentCharacter {
	public static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256];   // For ASCII characters
        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;

            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        return maxChar;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char mostFrequentChar = findMostFrequentCharacter(text);
        System.out.println("Most frequent character: " + mostFrequentChar);
    }
}
