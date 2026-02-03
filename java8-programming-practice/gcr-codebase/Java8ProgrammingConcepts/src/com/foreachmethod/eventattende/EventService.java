package com.foreachmethod.eventattende;

import java.util.*;

public class EventService {

	public void welcomeAttendees(List<String> attendees) {

		attendees.stream().forEach(name -> System.out.println("Welcome to the event, " + name + "!"));
	}
}
