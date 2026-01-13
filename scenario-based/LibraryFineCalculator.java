/*
15. Rohan’s Library Reminder App 
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.*;
import java.time.*;

public class LibraryFineCalculator {
    public static void main(String[] args) {
		//create a scanner object 
        Scanner sc = new Scanner(System.in);
	
        System.out.println("Rohan's Library Fine Calculator");
        System.out.println("----------------------------------");

		//Determining whether he got late or not
        for(int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i);

            System.out.print("Enter Due Date (yyyy-mm-dd): ");
            LocalDate dueDate = LocalDate.parse(sc.next());

            System.out.print("Enter Return Date (yyyy-mm-dd): ");
            LocalDate returnDate = LocalDate.parse(sc.next());

            long daysLate = java.time.temporal.ChronoUnit.DAYS.between(dueDate, returnDate);

            if(daysLate > 0) {
                int fine = (int)daysLate * 5;
                System.out.println("Late by " + daysLate + " days");
                System.out.println("Fine = " + fine);
            } else {
                System.out.println("Returned on time. No Fine!");
            }
        }

        sc.close();
		//Displaying the completion
        System.out.println("\nProcess Completed for 5 Books!");
    }
}
