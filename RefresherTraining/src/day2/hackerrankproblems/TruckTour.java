package day2.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckTour {
	public static int truckTour(List<List<Integer>> petrolPumps) {

		int start = 0;
		int balance = 0;
		int deficit = 0;

		for (int i = 0; i < petrolPumps.size(); i++) {

			int petrol = petrolPumps.get(i).get(0);
			int distance = petrolPumps.get(i).get(1);

			balance += petrol - distance;

			// Choose next pump as starting point
			if (balance < 0) {
				deficit += balance;
				start = i + 1;
				balance = 0;
			}
		}

		return (balance + deficit >= 0) ? start : -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<List<Integer>> petrolPumps = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			List<Integer> pump = new ArrayList<>();

			pump.add(sc.nextInt()); // Petrol
			pump.add(sc.nextInt()); // Distance

			petrolPumps.add(pump);
		}

		System.out.println(truckTour(petrolPumps));

		sc.close();
	}
}