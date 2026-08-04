package day2.classproblems.queueusingarray;
public class Main {

    public static void main(String[] args) throws Exception {

        CustomQueue queue = new CustomQueue(5);

        // Enqueue operation
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        // Dequeue operation
        System.out.println("Removed element: " + queue.dequeue());

        queue.display();

        queue.enqueue(50);

        queue.display();

        // Peek operation
        System.out.println("Front element: " + queue.peek());
    }
}