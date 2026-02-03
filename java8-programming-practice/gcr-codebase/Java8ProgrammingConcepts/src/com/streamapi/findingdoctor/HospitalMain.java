package com.streamapi.findingdoctor;

import java.util.*;

public class HospitalMain {

	public static void main(String[] args) {

		List<Doctor> doctors = Arrays.asList(new Doctor("Dr. Sharma", "Cardiology", true),
				new Doctor("Dr. Mehta", "Neurology", false), new Doctor("Dr. Singh", "Orthopedics", true),
				new Doctor("Dr. Khan", "Dermatology", true), new Doctor("Dr. Verma", "Pediatrics", false));

		DoctorService service = new DoctorService();

		List<Doctor> weekendDoctors = service.getWeekendAvailableDoctors(doctors);

		weekendDoctors.forEach(System.out::println);
	}
}
