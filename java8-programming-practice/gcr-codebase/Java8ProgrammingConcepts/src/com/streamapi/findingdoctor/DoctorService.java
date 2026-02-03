package com.streamapi.findingdoctor;

import java.util.*;
import java.util.stream.*;

public class DoctorService {

	public List<Doctor> getWeekendAvailableDoctors(List<Doctor> doctors) {

		return doctors.stream().filter(Doctor::isAvailableOnWeekend) // weekend availability
				.sorted(Comparator.comparing(Doctor::getSpecialty)) // sort by specialty
				.collect(Collectors.toList());
	}
}
