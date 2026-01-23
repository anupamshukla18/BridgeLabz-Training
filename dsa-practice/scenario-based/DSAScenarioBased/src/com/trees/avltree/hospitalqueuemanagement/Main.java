package com.trees.avltree.hospitalqueuemanagement;

public class Main {

	public static void main(String[] args) {

		HospitalAVL hospital = new HospitalAVL();

		hospital.registerPatient(930, "Anupam");
		hospital.registerPatient(1015, "Ravi");
		hospital.registerPatient(945, "Sneha");
		hospital.registerPatient(1100, "Amit");

		System.out.println("Patients by Arrival Time:");
		hospital.displayPatientsByArrival();

		System.out.println("\nDischarging patient at 09:45");
		hospital.dischargePatient(945);

		System.out.println("\nUpdated Queue:");
		hospital.displayPatientsByArrival();
	}
}
