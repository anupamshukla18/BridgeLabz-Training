package com.eventmanagementplatform;

import java.util.UUID;

abstract class Event implements ISchedulable {
	private final String eventId; // cannot be modified
	protected String eventName;
	protected String location;
	protected String date;
	protected int attendees;
	protected User organizer;

	private double venueCost;
	private double serviceCost;
	private double discount;

	// Constructor without services
	public Event(String eventName, String location, String date, int attendees, User organizer, double venueCost) {
		this.eventId = UUID.randomUUID().toString();
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.attendees = attendees;
		this.organizer = organizer;
		this.venueCost = venueCost;
		this.serviceCost = 0;
		this.discount = 0;
	}

	// Constructor with services
	public Event(String eventName, String location, String date, int attendees, User organizer, double venueCost,
			double serviceCost, double discount) {
		this(eventName, location, date, attendees, organizer, venueCost);
		this.serviceCost = serviceCost;
		this.discount = discount;
	}

	// Encapsulated cost calculation
	protected double calculateTotalCost() {
		return venueCost + serviceCost - discount;
	}

	public void showEventDetails() {
		System.out.println("\nEvent ID: " + eventId);
		System.out.println("Event: " + eventName);
		System.out.println("Organizer: " + organizer.getName());
		System.out.println("Location: " + location);
		System.out.println("Date: " + date);
		System.out.println("Attendees: " + attendees);
		System.out.println("Total Cost: ₹" + calculateTotalCost());
	}
}
