public class EarthVolume {
    public static void main(String[] args) {
		//Declaring and initializing variables
        double radiusKm = 6378;
        double pi = Math.PI;

		double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double kmToMiles = 0.006378;
        double volumeMiles = volumeKm * Math.pow(kmToMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}
