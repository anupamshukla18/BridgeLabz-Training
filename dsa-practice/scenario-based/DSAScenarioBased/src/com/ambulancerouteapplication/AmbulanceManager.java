package com.ambulancerouteapplication;

class AmbulanceManager {
	private CircularRoute route;
	private HospitalUnitNode currentPosition;

	AmbulanceManager() {
		route = new CircularRoute();
		initializeUnits();
	}

	private void initializeUnits() {
		route.addUnit("Emergency", true);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", true);
		route.addUnit("ICU", false);
		currentPosition = route.getHead();
	}

	public void redirectPatient() {
		if (currentPosition == null) {
			System.out.println("No units available");
			return;
		}

		HospitalUnitNode available = route.findAvailableUnit(currentPosition);

		if (available == null) {
			System.out.println("No available units right now");
			return;
		}

		System.out.println("Patient redirected to: " + available.unitName);
		currentPosition = available.next;
	}

	public void removeUnit(String name) {
		route.removeUnit(name);
		currentPosition = route.getHead();
	}

	public void displayUnits() {
		route.displayUnits();
	}
}
