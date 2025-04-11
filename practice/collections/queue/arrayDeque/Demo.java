package practice.collections.queue.arrayDeque;

import java.util.ArrayDeque;

public class Demo {
    public static void main(String[] args) {
        //ArrayDeque can be used on both queue and stack
        ArrayDeque<String> b=new ArrayDeque<>();
        b.add("hehhe");
        b.add("1");
        System.out.println(b);
    }
}
