import java.util.Scanner;

public class YoungestTallestUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Take input for Age and Height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = input.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            height[i] = input.nextDouble();
        }

        // Find Youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find Tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display Result
        System.out.println("\n---------------- Result ----------------");
        System.out.println("Youngest Friend : " + names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest Friend  : " + names[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");
    }
}
