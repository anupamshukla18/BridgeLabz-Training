package com.foreachmethod.eventattende;

import java.util.*;

public class EventMain {

	public static void main(String[] args) {

		List<String> attendees = Arrays.asList("Anuj", "Rohit", "Priya", "Neha");

		EventService service = new EventService();

		service.welcomeAttendees(attendees);
	}
}
