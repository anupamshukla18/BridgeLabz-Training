import java.util.Scanner;
public class AthleteRounds {
	public static int athleteRounds(double firstSide, double secondSide, double thirdSide) {
		//Total distance to run 
		double distanceToRun = 5000; // 5 km  in meters
		
		//perimeter of the triangle
		double perimeter = firstSide + secondSide + thirdSide;
		
		//Computing the total rounds
		double rounds = distanceToRun / perimeter;
		
		//returning the result
		return (int) (Math.ceil(rounds));
	}
	
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking the user input for all the sides
		System.out.println("Enter the first side of triangular park: ");
		double firstSide = input.nextDouble();
		System.out.println("Enter the second side of triangular park: ");
		double secondSide = input.nextDouble();
		System.out.println("Enter the third side of triangular park: ");
		double thirdSide = input.nextDouble();
		
		//Displaying the result
		System.out.println("The total number of rounds " 
							+ athleteRounds
							(firstSide, secondSide, thirdSide));
	}
}
		
		
		
		
		