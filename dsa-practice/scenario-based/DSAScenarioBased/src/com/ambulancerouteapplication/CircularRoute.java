package com.ambulancerouteapplication;

class CircularRoute {
	private HospitalUnitNode head;
	private HospitalUnitNode tail;

	// Add unit to circular list
	public void addUnit(String name, boolean available) {
		HospitalUnitNode newNode = new HospitalUnitNode(name, available);

		if (head == null) {
			head = tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	// Remove unit (maintenance)
	public void removeUnit(String name) {
		if (head == null) {
			System.out.println("No units available");
			return;
		}

		HospitalUnitNode curr = head;
		HospitalUnitNode prev = tail;

		do {
			if (curr.unitName.equalsIgnoreCase(name)) {
				if (curr == head && curr == tail) {
					head = tail = null;
				} else {
					prev.next = curr.next;
					if (curr == head)
						head = curr.next;
					if (curr == tail)
						tail = prev;
				}
				System.out.println("Unit removed: " + name);
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		System.out.println("Unit not found");
	}

	// Find nearest available unit
	public HospitalUnitNode findAvailableUnit(HospitalUnitNode start) {
		if (head == null)
			return null;

		HospitalUnitNode temp = start;

		do {
			if (temp.available) {
				return temp;
			}
			temp = temp.next;
		} while (temp != start);

		return null;
	}

	public HospitalUnitNode getHead() {
		return head;
	}

	public void displayUnits() {
		if (head == null) {
			System.out.println("No hospital units");
			return;
		}

		HospitalUnitNode temp = head;
		System.out.println("\nHospital Units:");
		do {
			System.out.println(temp.unitName + " (Available: " + temp.available + ")");
			temp = temp.next;
		} while (temp != head);
	}
}
