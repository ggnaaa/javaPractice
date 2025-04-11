package practice.collections.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Add {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a=new LinkedHashSet<>();
        a.add(3);
        a.add(1);
        a.add(9);
        a.add(6);
        a.add(14);
        System.out.println(a);
        LinkedList<Integer> list = new LinkedList<>(a);
        list.add(2,7);
        System.out.println(list);

    }
}
