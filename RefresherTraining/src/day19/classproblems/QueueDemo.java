package day19.classproblems;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(78);

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
