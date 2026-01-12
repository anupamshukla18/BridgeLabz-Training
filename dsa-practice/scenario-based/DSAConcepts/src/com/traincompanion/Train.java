package com.traincompanion;

class Train {
	private Compartment head;
	private Compartment tail;

	// Add a compartment at the end
	public void addCompartment(String name, boolean wifi, boolean pantry) {
		Compartment newCompartment = new Compartment(name, wifi, pantry);

		if (head == null) {
			head = tail = newCompartment;
		} else {
			tail.next = newCompartment;
			newCompartment.prev = tail;
			tail = newCompartment;
		}
	}

	// Remove a compartment by name
	public void removeCompartment(String name) {
		Compartment temp = head;

		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {

				if (temp == head) {
					head = temp.next;
				}

				if (temp == tail) {
					tail = temp.prev;
				}

				if (temp.prev != null) {
					temp.prev.next = temp.next;
				}

				if (temp.next != null) {
					temp.next.prev = temp.prev;
				}

				System.out.println(name + " compartment removed.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found.");
	}

	// Traverse compartments from start to end
	public void traverseForward() {
		Compartment temp = head;
		System.out.println("\nForward Traversal:");

		while (temp != null) {
			System.out.println(temp.name);
			temp = temp.next;
		}
	}

	// Traverse compartments from end to start
	public void traverseBackward() {
		Compartment temp = tail;
		System.out.println("\nBackward Traversal:");

		while (temp != null) {
			System.out.println(temp.name);
			temp = temp.prev;
		}
	}

	// Search for WiFi or Pantry service
	public void searchService(String service) {
		Compartment temp = head;
		System.out.println("\nSearching for " + service + ":");

		while (temp != null) {
			if (service.equalsIgnoreCase("wifi") && temp.hasWifi) {
				System.out.println(temp.name + " has WiFi");
			}
			if (service.equalsIgnoreCase("pantry") && temp.hasPantry) {
				System.out.println(temp.name + " has Pantry");
			}
			temp = temp.next;
		}
	}

	// Show previous and next compartments
	public void showAdjacent(String name) {
		Compartment temp = head;

		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {

				System.out.println("\nCurrent Compartment: " + temp.name);

				if (temp.prev != null)
					System.out.println("Previous: " + temp.prev.name);
				else
					System.out.println("Previous: None");

				if (temp.next != null)
					System.out.println("Next: " + temp.next.name);
				else
					System.out.println("Next: None");

				return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found.");
	}
}
