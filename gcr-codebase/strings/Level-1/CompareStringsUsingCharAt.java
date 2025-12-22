import java.util.Scanner;
public class CompareStringsUsingCharAt {
	// Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        // If lengths are different, strings can't be equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
		return true;  // All characters matched
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String string1 = input.next();

        System.out.print("Enter second string: ");
        String string2 = input.next();

        boolean manualResult = compareStrings(string1, string2);
        boolean equalsResult = string1.equals(string2);

        System.out.println("\nResult using charAt(): " + manualResult);
        System.out.println("Result using equals(): " + equalsResult);

        if (manualResult == equalsResult) {
            System.out.println("Both methods give the SAME RESULT.");
        } else {
            System.out.println("Results are DIFFERENT!");
        }
    }
}
