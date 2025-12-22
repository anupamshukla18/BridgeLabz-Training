import java.util.Scanner;
public class StringLengthWithoutLengthMethod {
	//Method to find string length wothout using length()
	public static int getStringLength(String text) {
		int count = 0;
		
		while(true) {
			try {
				text.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String input = sc.next();   // Takes input (Single word)
		int customLength = getStringLength(input);
		int originalLength = input.length();
		
		System.out.println("Length using custom method: " + customLength);
		System.out.println("Length using built-in length() method: " + originalLength);
	}
}
		
		