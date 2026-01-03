package com.oopspillars.hospitalmanagementsystem;

import java.util.*;

public class HospitalApplication {
	public static void main(String[] args) {
		// Polymorphic list
		List<Patient> patients = new ArrayList<>();

		patients.add(new InPatient(101, "Anupam", 25, "Fracture", 5, 3000));
		patients.add(new OutPatient(202, "Anuj", 30, "Fever", 800));

		for (Patient p : patients) {
			p.getPatientDetails();

			// Medical records
			p.addRecord("Initial diagnosis completed");
			p.addRecord("Medication prescribed");
			p.viewRecords();

			// Dynamic billing
			double billAmount = p.calculateBill();
			System.out.println("Total Bill Amount: ₹" + billAmount);

			System.out.println("----------------------------------");
		}
	}
}
