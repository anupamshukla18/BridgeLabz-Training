package com.browserbuddytabhistorymanager;

class TabHistory {
	private HistoryNode current;

	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);

		if (current != null) {
			current.next = newNode;
			newNode.prev = current;
		}
		current = newNode;

		System.out.println("Visited: " + url);
	}

	public void back() {
		if (current == null || current.prev == null) {
			System.out.println("No previous page");
			return;
		}
		current = current.prev;
		System.out.println("Back to: " + current.url);
	}

	public void forward() {
		if (current == null || current.next == null) {
			System.out.println("No forward page");
			return;
		}
		current = current.next;
		System.out.println("Forward to: " + current.url);
	}

	public String getCurrentPage() {
		return current != null ? current.url : null;
	}
}
