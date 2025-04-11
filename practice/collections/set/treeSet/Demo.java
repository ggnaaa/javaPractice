package practice.collections.set.treeSet;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(65);
        a.add(34);
//        a.add(3);  // no duplicates
        a.add(6);
        a.add(1);
        a.add(90);
        a.add(8);
        System.out.println(a);

    }
}

