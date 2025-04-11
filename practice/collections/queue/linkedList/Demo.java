package practice.collections.queue.linkedList;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        Queue<String> a = new LinkedList<>();
        a.add("apple");
        a.add("date");
        a.add("banana");
        a.add("cherry");
        System.out.println(a);
        List<String> b=new LinkedList<>(a);
        b.add(2,"berry");
        System.out.println(b);
    }
}
