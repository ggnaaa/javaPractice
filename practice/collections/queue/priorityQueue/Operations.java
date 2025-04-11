package practice.collections.queue.priorityQueue;

import java.util.PriorityQueue;

public class Operations {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.offer(10);
        p.offer(5);
        p.offer(15);
        p.offer(7);
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println("after peek- "+p);
        System.out.println(p.poll());
        System.out.println("after poll- "+p);
    }
}
