import java.util.Scanner;
public class ToggleCaseProgram {
	public static String convertIntoToggleCase(String word) {
		StringBuilder toggledString = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				toggledString.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				toggledString.append(Character.toUpperCase(ch));
			} else {
				// for non-alphabetic characters, keeping it as it is 
				toggledString.append(ch);
	    	} 
		}
		
		//returning the result
		return toggledString.toString();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking a string as input
		String word = input.nextLine();
		
		//Calling the method 
		String toggledString = convertIntoToggleCase(word);
		
		//Displaying the result
		System.out.println("Toggled String: " + toggledString);
	}
}
