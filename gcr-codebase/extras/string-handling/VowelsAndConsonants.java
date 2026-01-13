import java.util.Scanner;
public class VowelsAndConsonants {
	public static int[] countVowelsAndConsonants(String text) {
		
		int vowels = 0, consonants = 0; //Variables for counting vowels and consonants

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			//Checking if the alphabet is consonant or vowel
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' ||
					ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		//returning the result
		return new int[]{vowels, consonants};
	}
	
	public static void main(String[] args) {
		//creating a scanner object
		Scanner input = new Scanner(System.in);        
		
		System.out.println("Enter a string: ");
		//taking a string as input
		String text = input.nextLine();          
		
		//Converting the string to lowercase	
		text = text.toLowerCase();				       
		
		//Calling the method
		int[] result = countVowelsAndConsonants(text); 
		
		//Displaying the result
		System.out.println("Vowels: " + result[0]);
		System.out.println("Consonants: " + result[1]);
	}
}