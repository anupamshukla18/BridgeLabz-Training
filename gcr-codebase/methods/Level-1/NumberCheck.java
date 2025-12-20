import java.util.Scanner;
public class NumberCheck {
	public static int numberCheck(int number) {
		//Checking the number and returning the result as well
		if (number > 0) {
			return 1;
		} else if (number < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking number as the user input 
		System.out.println("Enter your number: ");
		int number = input.nextInt();
		
		//Displaying the result
		System.out.println(numberCheck(number));
	}
}