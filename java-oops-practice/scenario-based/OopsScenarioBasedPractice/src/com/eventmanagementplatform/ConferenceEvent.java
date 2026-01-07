package com.eventmanagementplatform;

class ConferenceEvent extends Event {
	public ConferenceEvent(String name, String location, String date, int attendees, User organizer, double venueCost,
			double serviceCost) {
		super(name, location, date, attendees, organizer, venueCost, serviceCost, 3000); // corporate discount
	}

	@Override
	public void schedule() {
		System.out.println("📊 Conference scheduled with AV and seating setup.");
	}

	@Override
	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println("Conference rescheduled to " + newDate);
	}

	@Override
	public void cancel() {
		System.out.println("Conference cancelled. Penalty may apply.");
	}
}
