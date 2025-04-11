package practice.collections.set.treeSet;

import java.util.LinkedList;
import java.util.TreeSet;

public class Add {
    public static void main(String[] args) {
        TreeSet<Integer> a=new TreeSet<>();
        a.add(3);
        a.add(1);
        a.add(9);
        a.add(6);
        a.add(14);
        System.out.println(a);
        LinkedList<Integer> list = new LinkedList<>(a);
        list.add(2,7);
        System.out.println(list);
        TreeSet<Integer> a1=new TreeSet<>(list);
        System.out.println(a1);
    }
}
