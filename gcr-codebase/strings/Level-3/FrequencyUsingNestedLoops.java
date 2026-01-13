import java.util.Scanner;
public class FrequencyUsingNestedLoops {
    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Find frequency using nested loops
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0')        // already counted
                continue;

            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';     // mark duplicate
                }
            }

            freq[i] = count;
        }

        // Create result String array
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {     // only valid characters
                result[index] = chars[i] + " - " + freq[i];
                index++;
            }
        }

        // Trim array to valid size
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    // Display Method
    public static void display(String[] arr) {
        System.out.println("\nCharacter Frequency:");
        System.out.println("-----------------------");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = findFrequency(text);

        display(frequency);
    }
}
