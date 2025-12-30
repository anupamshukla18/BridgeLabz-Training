package com.objectmodeling;

import java.util.*;

//Patient Class
class Patient {
	private String patientName;
	private List<Doctor> consultedDoctors;

	public Patient(String patientName) {
		this.patientName = patientName;
		consultedDoctors = new ArrayList<>();
	}

	public String getPatientName() {
		return patientName;
	}

	// add doctor to patient's consultation list
	public void addDoctor(Doctor doctor) {
		consultedDoctors.add(doctor);
	}

	// show doctors consulted by patient
	public void showMyDoctors() {
		System.out.println(patientName + " has consulted:");
		for (Doctor d : consultedDoctors) {
			System.out.println("- " + d.getDoctorName());
		}
	}
}

//Doctor Class
class Doctor {
	private String doctorName;
	private List<Patient> patientsList;

	public Doctor(String doctorName) {
		this.doctorName = doctorName;
		patientsList = new ArrayList<>();
	}

	public String getDoctorName() {
		return doctorName;
	}

	// doctor consults patient (communication + association)
	public void consult(Patient patient) {
		System.out.println("Doctor " + doctorName + " is consulting patient " + patient.getPatientName());

		patientsList.add(patient); // doctor side mapping
		patient.addDoctor(this); // patient side mapping
	}

	// show patients treated by doctor
	public void showMyPatients() {
		System.out.println("Patients treated by Dr. " + doctorName + ":");
		for (Patient p : patientsList) {
			System.out.println("- " + p.getPatientName());
		}
	}
}

//Hospital Class
class Hospital {
	private String hospitalName;
	private List<Doctor> doctors;
	private List<Patient> patients;

	public Hospital(String hospitalName) {
		this.hospitalName = hospitalName;
		doctors = new ArrayList<>();
		patients = new ArrayList<>();
	}

	// add doctor to hospital
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	// add patient to hospital
	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	// display hospital doctors
	public void showDoctors() {
		System.out.println("\nDoctors in " + hospitalName + ":");
		for (Doctor d : doctors) {
			System.out.println("- " + d.getDoctorName());
		}
	}

	// display hospital patients
	public void showPatients() {
		System.out.println("\nPatients in " + hospitalName + ":");
		for (Patient p : patients) {
			System.out.println("- " + p.getPatientName());
		}
	}
}

//Main Class
public class HospitalAssociationTest {
	public static void main(String[] args) {

		// create hospital
		Hospital hospital = new Hospital("City Care Hospital");

		// create doctors
		Doctor d1 = new Doctor("Dr. Rahul");
		Doctor d2 = new Doctor("Dr. Neha");

		// create patients
		Patient p1 = new Patient("Rohan");
		Patient p2 = new Patient("Ananya");

		// add to hospital
		hospital.addDoctor(d1);
		hospital.addDoctor(d2);

		hospital.addPatient(p1);
		hospital.addPatient(p2);

		hospital.showDoctors();
		hospital.showPatients();
		System.out.println();

		// consultations (Many-to-Many Communication)
		d1.consult(p1);
		d1.consult(p2);

		d2.consult(p1);

		System.out.println();

		// Show details
		d1.showMyPatients();
		System.out.println();

		d2.showMyPatients();
		System.out.println();

		p1.showMyDoctors();
		System.out.println();

		p2.showMyDoctors();
	}
}
