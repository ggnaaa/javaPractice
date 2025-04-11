package practice.collections.queue.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Reverse {
    public static void main(String[] args) {
        //smallest int has highest priority.
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.offer(10);
        p.offer(5);
        p.offer(15);
        p.offer(7);
        p.offer(3);
        p.offer(9);
        p.offer(45);
        p.offer(79);
        p.offer(8);
        System.out.println(p);
        //using "Collections.reverseOrder()" we can reverse the order and highest will become the priority
        // Collections.reverseOrder() == (a, b) -> b - a
//        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        q.offer(10);
        q.offer(5);
        q.offer(15);
        q.offer(7);
        System.out.println(q);
    }
}
