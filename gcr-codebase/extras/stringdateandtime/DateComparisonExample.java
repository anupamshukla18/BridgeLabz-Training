import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first date (yyyy-mm-dd): ");
        String first = sc.nextLine();
        
        System.out.print("Enter second date (yyyy-mm-dd): ");
        String second = sc.nextLine();
        
        LocalDate date1 = LocalDate.parse(first);
        LocalDate date2 = LocalDate.parse(second);
        
        System.out.println("\nDate 1 : " + date1);
        System.out.println("Date 2 : " + date2);
        System.out.println();

        if(date1.isBefore(date2)) {
            System.out.println("Date 1 is BEFORE Date 2");
        } 
        else if(date1.isAfter(date2)) {
            System.out.println("Date 1 is AFTER Date 2");
        } 
        else if(date1.isEqual(date2)) {
            System.out.println("Both dates are EQUAL");
        }
    }
}
