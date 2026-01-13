import java.util.Scanner;
class VotingEligibilityForStudents {
	public static void main(String[] args) {
		//Create a Scanner object 
		Scanner input = new Scanner(System.in);
		
		//Declaring an array for storing the ages of the students 
		int[] ages = new int[10];
		
		//Taking input of the students
		System.out.print("Enter the ages of the student: ");
		for (int i = 0; i < ages.length; i++) {
			ages[i] = input.nextInt();
		}
		
		//Checking if they are elgible for voting or not and displaying the same as well
		for (int i = 0; i < ages.length; i++){
			if (ages[i] < 0 || ages[i] > 110) {
				//For Invalid age
				System.err.println("Invalid age!!");
			} else {
				if (ages[i] > 18) {
					System.out.println("The student with the age " + ages[i] + " can vote.");
			    } else {
					System.out.println("The student with the age " + ages[i] + " cannot vote.");
			    }
			}
		}
	}
}