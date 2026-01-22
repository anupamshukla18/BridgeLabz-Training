package com.collections.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;

public class HospitalTriageSystem {
	public static void main(String[] args) {
		PriorityQueue<Patient> pq = new PriorityQueue<>();

		pq.add(new Patient("John", 3));
		pq.add(new Patient("Alice", 5));
		pq.add(new Patient("Bob", 2));

		System.out.println("Treatment Order:");

		while (!pq.isEmpty()) {
			System.out.println(pq.poll().name);
		}
	}
}
