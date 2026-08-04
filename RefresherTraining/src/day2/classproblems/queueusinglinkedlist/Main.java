package day2.classproblems.queueusinglinkedlist;

public class Main {

	public static void main(String[] args) throws Exception {

		CustomQueue queue = new CustomQueue();

		// Enqueue operation
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		queue.display();

		// Dequeue operation
		System.out.println("Removed element: " + queue.dequeue());

		queue.display();

		// Peek operation
		System.out.println("Front element: " + queue.peek());

		System.out.println("Size of the queue: " + queue.size());
	}
}