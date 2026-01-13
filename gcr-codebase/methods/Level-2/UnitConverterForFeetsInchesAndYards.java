public class UnitConverterForFeetsInchesAndYards {
	// Convert Yards to Feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert Feet to Yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert Meters to Inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert Inches to Meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Optional Test Main Method
    public static void main(String[] args) {
        System.out.println("5 Yards to Feet: " + convertYardsToFeet(5));
        System.out.println("12 Feet to Yards: " + convertFeetToYards(12));
        System.out.println("2 Meters to Inches: " + convertMetersToInches(2));
        System.out.println("20 Inches to Meters: " + convertInchesToMeters(20));
        System.out.println("10 Inches to Centimeters: " + convertInchesToCentimeters(10));
    }
}
