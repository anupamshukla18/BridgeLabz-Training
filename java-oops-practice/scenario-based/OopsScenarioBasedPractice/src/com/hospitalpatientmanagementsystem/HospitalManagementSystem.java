package com.hospitalpatientmanagementsystem;

import java.util.Scanner;

public class HospitalManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// -------- Doctor Details --------
		System.out.println("Enter Doctor ID:");
		int docId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Doctor Name:");
		String docName = sc.nextLine();

		System.out.println("Enter Specialization:");
		String specialization = sc.nextLine();

		Doctor doctor = new Doctor(docId, docName, specialization);
		doctor.displayInfo();

		// -------- Patient Handling --------
		System.out.println("\nHow many patients do you want to register?");
		int count = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= count; i++) {

			System.out.println("\nRegistering Patient " + i);
			System.out.println("Enter Patient Type (1-InPatient, 2-OutPatient):");
			int type = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Patient ID:");
			int pid = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Patient Name:");
			String pname = sc.nextLine();

			if (type == 1) {
				System.out.println("Enter Diagnosis:");
				String diagnosis = sc.nextLine();

				System.out.println("Enter Number of Days Admitted:");
				int days = sc.nextInt();

				InPatient inPatient = new InPatient(pid, pname, diagnosis, days);
				inPatient.assignDoctor(docName);
				inPatient.displayInfo();

				System.out.println("Enter Treatment Cost:");
				double cost = sc.nextDouble();

				Bill bill = new Bill(inPatient, cost);
				bill.printBill();

			} else {
				OutPatient outPatient = new OutPatient(pid, pname);
				outPatient.assignDoctor(docName);
				outPatient.displayInfo();
			}
		}

		sc.close();
	}
}
