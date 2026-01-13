package com.ambulanceroute;

class HospitalUnitNode {
	String unitName;
	boolean available;
	HospitalUnitNode next;

	HospitalUnitNode(String unitName, boolean available) {
		this.unitName = unitName;
		this.available = available;
		this.next = null;
	}
}
