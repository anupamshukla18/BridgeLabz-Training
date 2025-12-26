import java.util.Scanner;
public class removeDuplicates {
	public static String removeDuplicate(String input) {
		//For storing the string without duplicates
		String output = "";
		
		//Checking if there are characters repeating or not
		//If repeating then try not adding them 
		for (int i = 0; i < input.length(); i++) {
			if (!output.contains(String.valueOf(input.charAt(i)))) {
				output += input.charAt(i);
			}
			else {
				continue;
			}
		}
		//returning the result
		return output;
	}
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking a string as input
		System.out.println("Enter a string: ");
		String inputString = input.nextLine();
		
		//calling a method
		String outputString = removeDuplicate(inputString);
		
		//Display the result
		System.out.println("The string without duplicates: " + outputString);
	}
}