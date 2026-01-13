import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter date in format (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();
        
        LocalDate date = LocalDate.parse(inputDate);
        
        System.out.println("\nOriginal Date : " + date);

        // Add 7 days, 1 month, 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After Adding 7 Days, 1 Month, 2 Years : " + updatedDate);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);
        System.out.println("After Subtracting 3 Weeks : " + finalDate);
    }
}
