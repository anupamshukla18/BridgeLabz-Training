public class UnitConverter {
	// Convert Kilometers to Miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert Miles to Kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert Meters to Feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert Feet to Meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Optional main method to test the converter (you can remove this if not needed)
    public static void main(String[] args) {
        System.out.println("10 Km in Miles = " + convertKmToMiles(10));
        System.out.println("10 Miles in Km = " + convertMilesToKm(10));
        System.out.println("5 Meters in Feet = " + convertMetersToFeet(5));
        System.out.println("10 Feet in Meters = " + convertFeetToMeters(10));
    }
}
