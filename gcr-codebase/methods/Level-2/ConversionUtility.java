public class ConversionUtility {
	// Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Optional Test
    public static void main(String[] args) {
        System.out.println("98.6°F to Celsius = " + convertFahrenheitToCelsius(98.6));
        System.out.println("37°C to Fahrenheit = " + convertCelsiusToFahrenheit(37));
        System.out.println("150 Pounds to Kg = " + convertPoundsToKilograms(150));
        System.out.println("68 Kg to Pounds = " + convertKilogramsToPounds(68));
        System.out.println("10 Gallons to Liters = " + convertGallonsToLiters(10));
        System.out.println("20 Liters to Gallons = " + convertLitersToGallons(20));
    }
}
