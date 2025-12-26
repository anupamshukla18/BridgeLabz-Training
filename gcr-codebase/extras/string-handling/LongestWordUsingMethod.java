import java.util.Scanner;
public class LongestWordUsingMethod {
	public static String findLongestWord(String sentence) {
		String[] words = sentence.split("\\s+");
		String longest = "";
		
		for (String word : words) {
			//optional - remove punctuation 
			word = word.replaceAll("[^a-zA-Z]", "");
			
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
		//returning the result
		return longest;
	}
	
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking string as input
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		//Displaying the result
		String longest = findLongestWord(sentence);
		System.out.println("Longest Word: " + longest);
	}
}
