package com.smartparkingapplication;

class ParkingSlot implements IPayable {
	private String slotId;
	private boolean isOccupied;
	private String vehicleTypeAllowed;
	private Vehicle parkedVehicle;

	private final int MAX_ALLOWED_HOURS = 5;

	public ParkingSlot(String slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
	}

	public boolean isAvailable() {
		return !isOccupied;
	}

	public void parkVehicle(Vehicle vehicle) {
		if (!isOccupied) {
			this.parkedVehicle = vehicle;
			this.isOccupied = true;
			log("Vehicle parked: " + vehicle.vehicleNumber);
		} else {
			log("Slot already occupied");
		}
	}

	public void vacateSlot() {
		this.parkedVehicle = null;
		this.isOccupied = false;
		log("Slot vacated");
	}

	@Override
	public double calculateCharges(int hours) {
		double baseRate = parkedVehicle.getBaseRate();
		double total = baseRate * hours;

		if (hours > MAX_ALLOWED_HOURS) {
			total += 200; // penalty
		}

		return total;
	}

	// Internal logs (private)
	private void log(String message) {
		System.out.println("[LOG - Slot " + slotId + "] " + message);
	}
}
