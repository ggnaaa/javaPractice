package mar25.collection.queue.deque;

import java.util.*;

public class PollLast {
    public static void main(String[] args) {
        Deque<Integer> a = new LinkedList<>();
        a.offer(2);
        a.offer(4);
        a.offer(5);
        System.out.println(a);
        a.pollLast();
        System.out.println(a);
    }
}
