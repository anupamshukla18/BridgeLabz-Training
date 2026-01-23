package com.trees.binarysearchtree.digitalrecordsystem;

class StudentRecord {
	int roll;
	String name;
	StudentRecord left, right;

	StudentRecord(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
}
