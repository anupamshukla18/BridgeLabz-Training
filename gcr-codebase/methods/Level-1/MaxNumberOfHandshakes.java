import java.util.Scanner;
public class MaxNumberOfHandshakes {
	public static int maxNumberOfHandshakes(int numberOfStudents) {
		//Storing the number of students in a temporary variable
		int temp = numberOfStudents;
		
		//calculating the number of possible handshakes
		int numberOfHandshakes = (numberOfStudents *  (numberOfStudents - 1)) / 2;
		
		//returning the result
		return numberOfHandshakes;
	}
	
	public static void main(String[] args) {
		//Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//taking input of number of students
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		//Displaying the result
		System.out.println("The maximum number of possible handshakes for the "+ numberOfStudents 
							+ " number of students will be " +  maxNumberOfHandshakes(numberOfStudents));
	}
}