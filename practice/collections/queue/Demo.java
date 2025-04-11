package practice.collections.queue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        ArrayDeque<String> a=new ArrayDeque<>();
        a.add("apple");
        a.add("date");
        a.add("banana");
        a.add("cherry");
        System.out.println(a);

        ArrayDeque<String> b=new ArrayDeque<>();
        b.add("hehhe");
        System.out.println(b);
    }
}
