package com.trafficmanager;

// Node of Circular Linked List
class VehicleNode {
	String vehicleNo;
	VehicleNode next;

	VehicleNode(String vehicleNo) {
		this.vehicleNo = vehicleNo;
		this.next = null;
	}
}
