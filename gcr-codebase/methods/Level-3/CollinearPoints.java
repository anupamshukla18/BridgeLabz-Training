import java.util.Scanner;

public class CollinearPoints {
	// Method 1: Using Slope Formula 
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {

        // To avoid division, use cross multiplication:
        // (y2−y1)(x3−x1) == (y3−y1)(x2−x1)
        int lhs = (y2 - y1) * (x3 - x1);
        int rhs = (y3 - y1) * (x2 - x1);

        return lhs == rhs;
    }

    // Method 2: Using Area of Triangle Formula 
    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {

        // Area = 1/2 * [ x1(y2−y3) + x2(y3−y1) + x3(y1−y2) ]
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);

        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1, y1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2, y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter x3, y3:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Using slope method
        boolean slopeResult = isCollinearSlope(x1, y1, x2, y2, x3, y3);

        // Using area method
        boolean areaResult = isCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Method: " +
                (slopeResult ? "Points are Collinear" : "Points are NOT Collinear"));

        System.out.println("Using Area Method: " +
                (areaResult ? "Points are Collinear" : "Points are NOT Collinear"));
    }
}
