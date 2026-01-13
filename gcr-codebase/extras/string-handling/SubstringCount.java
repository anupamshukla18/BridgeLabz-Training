import java.util.Scanner;
public class SubstringCount {
	public static int countSubstringOccurences(String text, String sub){
		int count = 0;   //For storing the count
		int index = 0;   //For stroing the index
		
		while((index = text.indexOf(sub, index)) != -1) {
			count++;
			index++; //Move one step forward to allow overlapping matches
		}
		//returning the result
		return count;
	}
	
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking the string as input
		System.out.println("Enter the main String: ");
		String text = sc.nextLine();
		
		//Taking the substring as input
		System.out.println("Enter the substring to search: ");
		String sub = sc.nextLine();
		
		//calling the method 
		int count = countSubstringOccurences(text, sub);
		System.out.println("The substring " + sub + " occurs " + count + " time(s).");
	}
}