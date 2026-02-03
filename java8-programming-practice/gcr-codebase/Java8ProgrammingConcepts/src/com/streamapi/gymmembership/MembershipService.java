package com.streamapi.gymmembership;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class MembershipService {

	public List<GymMember> getExpiringMembers(List<GymMember> members) {

		LocalDate today = LocalDate.now();
		LocalDate next30Days = today.plusDays(30);

		return members.stream().filter(member -> !member.getExpiryDate().isBefore(today)
				&& member.getExpiryDate().isBefore(next30Days.plusDays(1))).collect(Collectors.toList());
	}
}
