import java.util.Scanner;
public class ReversedString {
	public static String reverseString(String text) {
		//An empty string for storing the reversed one
		String reversed = ""; 
		
		//Reversing the String 
		for (int i = text.length() - 1; i >= 0; i--) {
			char ch = text.charAt(i);
			reversed += ch;
		}
		//returning the result
		return reversed;
	}
	
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking a string as input
		System.out.println("Enter a string: ");
		String originalString = input.nextLine();
		
		//calling a method
		String reversedString = reverseString(originalString);
		
		//Displaying the reversed String
		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String: " + reversedString);
	}
}