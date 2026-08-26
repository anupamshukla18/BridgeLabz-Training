package day19.classproblems;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(30);
        p.add(40);
        p.add(10);

        System.out.println(p);
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p);
    }
}
