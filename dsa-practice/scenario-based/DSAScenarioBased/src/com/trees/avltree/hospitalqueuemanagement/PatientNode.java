package com.trees.avltree.hospitalqueuemanagement;

public class PatientNode {

	int checkInTime;
	String name;
	int height;

	PatientNode left, right;

	public PatientNode(int checkInTime, String name) {
		this.checkInTime = checkInTime;
		this.name = name;
		this.height = 1;
	}
}
