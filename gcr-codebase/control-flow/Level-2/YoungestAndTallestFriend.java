import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();

        // Take heights
        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = input.nextDouble();

        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = input.nextDouble();

        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = input.nextDouble();

        // -------- Find Youngest --------
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest Friend: Amar (Age: " + ageAmar + ")");
        }
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest Friend: Akbar (Age: " + ageAkbar + ")");
        }
        else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Youngest Friend: Anthony (Age: " + ageAnthony + ")");
        }
        else {
            System.out.println("Two or more friends have the same youngest age.");
        }

        // -------- Find Tallest --------
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest Friend: Amar (Height: " + heightAmar + " cm)");
        }
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest Friend: Akbar (Height: " + heightAkbar + " cm)");
        }
        else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Tallest Friend: Anthony (Height: " + heightAnthony + " cm)");
        }
        else {
            System.out.println("Two or more friends have the same tallest height.");
        }
    }
}
