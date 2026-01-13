import java.util.Scanner;
public class SimpleInterest {
	public static float simpleInterest(float principal, float rate, float time) {
		//Calculating the simple interest
		float simpleInterest = (principal * rate * time) / 100;
		
		//returning the result
		return simpleInterest;
	}
	
	public static void main(String[] args) {
		//Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Taking user input for principal, rate and time
		System.out.println("Enter Principal: ");
		float principal = input.nextFloat();
		System.out.println("Enter Rate: ");
		float rate = input.nextFloat();
		System.out.println("Enter Time: ");
		float time = input.nextFloat();
		
		
		//Displaying the result 
		System.out.println("The Simple Interest is " + simpleInterest(principal,rate,time) 
							+ " for Principal " + principal 
							+ ", Rate of Interest " + rate 
							+ " and Time " + time );
	}
}