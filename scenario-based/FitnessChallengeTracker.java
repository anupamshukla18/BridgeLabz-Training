/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.Scanner;
 
class FitnessChallengeTracker {
	public static void main(String[] args) {
		//Creating a scanner object
		Scanner input = new Scanner(System.in);
		
		//creating a variable for storing the total and average
		int sum = 0;
		double average = 0.0;
		
		//Creating an array for storing Sandeep's total number of push-ups for each day
		int[] pushUps = new int[7];
		int days = 0;
		
		//initializing the variables for storing the total and average
		for (int num : pushUps) {
			System.out.print("Enter day " + (days+1) + " push-ups: ");
			num = input.nextInt();
			days++;
			
			if (num > 0) {
				sum += num;
			} else {
				continue;
			}
		}
		
		//calculating the average of Sandeep's push-ups
		average = (double) (sum / 7);
		
		//displaying the result
		System.out.println("Sandeep's total number of push-ups: " +  sum);
		System.out.println("Sandeep's average push-ups: " + average);
	}
}
