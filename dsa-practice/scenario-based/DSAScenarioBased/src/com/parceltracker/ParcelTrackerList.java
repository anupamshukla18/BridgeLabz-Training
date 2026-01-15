package com.parceltracker;

// Singly Linked List for parcel tracking
class ParcelTrackerList {

	Node head;

	// Add stage at end
	void addStage(String stage) {
		Node newNode = new Node(stage);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Add stage after a given stage
	void addAfter(String existingStage, String newStage) {
		Node temp = head;

		while (temp != null && !temp.stage.equals(existingStage)) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Stage not found");
			return;
		}

		Node newNode = new Node(newStage);
		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Forward tracking
	void displayStages() {
		if (head == null) {
			System.out.println("No tracking data available");
			return;
		}

		Node temp = head;
		System.out.println("\nParcel Tracking Status:");
		while (temp != null) {
			System.out.print(temp.stage);
			if (temp.next != null)
				System.out.print(" -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Handle lost parcel (break chain)
	void markLostAfter(String stage) {
		Node temp = head;

		while (temp != null && !temp.stage.equals(stage)) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Stage not found");
			return;
		}

		temp.next = null;
		System.out.println("Parcel lost after stage: " + stage);
	}
}
