/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;

class SchoolBusAttendance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// An array of students going from the bus
		String[] students = {"Anuj", "Vishal", "Vikash", "Aryan", "bhoomi",
		"Ashish", "Samarth", "Utkarsh", "Om", "Viru"};
		
		// variables for counting the number of present and absent students
		int presentStudents = 0;
		int absentStudents = 0;
		
		// Seeing how many students are absent or present
		for (String i : students) {
			System.out.println("Is " + i + " present or not(P/A)? ");
			String input = sc.next();
			if (input.equalsIgnoreCase("P")) {
				presentStudents++;
			} else {
				absentStudents++;
			}
		}
		//Displaying the result
		System.out.println("The number of present students: " + presentStudents);
		System.out.println("The number of absent students: " + absentStudents);
		
		sc.close();
	}
}
		
		