package com.streamapi.gymmembership;

import java.time.LocalDate;
import java.util.*;

public class GymMain {

	public static void main(String[] args) {

		List<GymMember> members = Arrays.asList(new GymMember(1, "Anuj", LocalDate.now().plusDays(10)),
				new GymMember(2, "Rohit", LocalDate.now().plusDays(40)),
				new GymMember(3, "Priya", LocalDate.now().plusDays(25)),
				new GymMember(4, "Neha", LocalDate.now().minusDays(2)),
				new GymMember(5, "Amit", LocalDate.now().plusDays(30)));

		MembershipService service = new MembershipService();

		List<GymMember> expiringSoon = service.getExpiringMembers(members);

		expiringSoon.forEach(System.out::println);
	}
}
