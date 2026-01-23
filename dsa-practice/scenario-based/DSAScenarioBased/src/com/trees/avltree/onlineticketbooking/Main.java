package com.trees.avltree.onlineticketbooking;

public class Main {

	public static void main(String[] args) {

		EventBST booking = new EventBST();

		booking.insert(1800, "Concert");
		booking.insert(1400, "Movie");
		booking.insert(2000, "Stand-up Comedy");
		booking.insert(1600, "Play");

		System.out.println("📅 Upcoming Events:");
		booking.displayUpcomingEvents();

		System.out.println("\n❌ Cancel Event at 16:00");
		booking.delete(1600);

		System.out.println("\n📅 Updated Schedule:");
		booking.displayUpcomingEvents();
	}
}
