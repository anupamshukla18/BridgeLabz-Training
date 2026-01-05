package com.linkedlist.circular.roundrobinalgo;

import java.util.Scanner;

public class RoundRobinScheduling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RoundRobinScheduler scheduler = new RoundRobinScheduler();

		System.out.print("Enter number of processes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("\nProcess ID: ");
			int id = sc.nextInt();
			System.out.print("Burst Time: ");
			int burst = sc.nextInt();
			System.out.print("Priority: ");
			int priority = sc.nextInt();

			scheduler.addProcess(id, burst, priority);
		}

		System.out.print("\nEnter Time Quantum: ");
		int quantum = sc.nextInt();

		scheduler.schedule(quantum);
		sc.close();
	}
}
