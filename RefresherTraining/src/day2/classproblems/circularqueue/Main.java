package day2.classproblems.circularqueue;
public class Main {

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        
        // Enqueue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Displaying the queue
        queue.display();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.display();

        queue.enqueue(60);
        queue.enqueue(70);

        queue.display();

        // Peek operation
        System.out.println("Front element: " + queue.peek());
    }
}