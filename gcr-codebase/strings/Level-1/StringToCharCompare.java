import java.util.Scanner;
public class StringToCharCompare {
    // Method to return characters of string without using toCharArray()
    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        
        for(int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);   // extracting character manually
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }
        
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next();

        // Calling user defined method
        char[] userDefinedChars = getChars(text);

        // Using built-in toCharArray()
        char[] builtInChars = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(userDefinedChars, builtInChars);

        // Display results
        System.out.println("\nCharacters using user-defined method:");
        for(char ch : userDefinedChars) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nCharacters using toCharArray():");
        for(char ch : builtInChars) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nAre both character arrays equal? : " + result);
    }
}
