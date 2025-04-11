package practice.collections.queue.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        Deque<String> a = new LinkedList<>();
        a.addFirst("apple");
        a.addLast("date");
        a.offerLast("banana");
        a.offerFirst("cherry");

        System.out.println(a);
    }
}
