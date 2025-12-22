import java.util.Scanner;

public class MonthlyCalendarProgram {
	// Month names array
    static String[] monthNames = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
    };

    // Days in each month
    static int[] daysInMonth = {
            31,28,31,30,31,30,31,31,30,31,30,31
    };

    // Check Leap Year
    public static boolean isLeapYear(int year) {
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return true;
        return false;
    }

    // Get Month Name
    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }

    // Get days in month
    public static int getNumberOfDays(int month, int year) {
        if(month == 2 && isLeapYear(year))
            return 29;
        return daysInMonth[month - 1];
    }

    // Get first day of month using Gregorian Algorithm
    // 0 = Sunday, 1 = Monday ... 6 = Saturday
    public static int getFirstDay(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter Year: ");
        int year = input.nextInt();

        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);

        // First day of the month
        int firstDay = getFirstDay(1, month, year);  

        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop → spaces till first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop → Print all days
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
