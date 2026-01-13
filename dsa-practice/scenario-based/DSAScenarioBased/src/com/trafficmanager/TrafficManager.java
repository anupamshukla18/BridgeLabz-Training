package com.trafficmanager;

// Manages the roundabout
class TrafficManager {
	VehicleNode last;
	WaitingQueue waitingQueue;

	TrafficManager(int queueSize) {
		last = null;
		waitingQueue = new WaitingQueue(queueSize);
	}

	// Add vehicle to roundabout
	void addToRoundabout(String vehicleNo) {
		VehicleNode newNode = new VehicleNode(vehicleNo);

		if (last == null) {
			last = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		System.out.println("Vehicle entered roundabout.");
	}

	// Add vehicle to waiting queue
	void addToQueue(String vehicleNo) {
		waitingQueue.enqueue(vehicleNo);
	}

	// Remove vehicle from roundabout
	void removeVehicle(String vehicleNo) {
		if (last == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		VehicleNode curr = last.next;
		VehicleNode prev = last;

		do {
			if (curr.vehicleNo.equals(vehicleNo)) {

				if (curr == last && curr.next == last) {
					last = null;
				} else {
					prev.next = curr.next;
					if (curr == last) {
						last = prev;
					}
				}

				System.out.println("Vehicle exited roundabout.");

				// Move one vehicle from queue
				String v = waitingQueue.dequeue();
				if (v != null) {
					addToRoundabout(v);
				}
				return;
			}
			prev = curr;
			curr = curr.next;

		} while (curr != last.next);

		System.out.println("Vehicle not found.");
	}

	// Print roundabout state
	void printRoundabout() {
		if (last == null) {
			System.out.println("Roundabout empty.");
			return;
		}

		VehicleNode temp = last.next;
		System.out.print("Roundabout: ");
		do {
			System.out.print(temp.vehicleNo + " -> ");
			temp = temp.next;
		} while (temp != last.next);
		System.out.println("START");
	}
}
