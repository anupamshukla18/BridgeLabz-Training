package com.sortingalgorithmsscneariobasedproblems.medwarehouse;

public class MedWarehouseApp {

	public static void main(String[] args) {

		Medicine[] medicines = {
				new Medicine("Paracetamol", 30),
				new Medicine("Insulin", 10),
				new Medicine("Antibiotic", 20),
				new Medicine("Cough Syrup", 15),
				new Medicine("Vaccine", 5)
		};

		MedWarehouseSorter sorter = new MedWarehouseSorter();
		sorter.divide(medicines, 0, medicines.length - 1);

		System.out.println("Medicines Sorted by Expiry Date:");
		sorter.display(medicines);
	}
}
