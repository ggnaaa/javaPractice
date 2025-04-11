package practice.collections.set.hastSet;

import java.util.HashSet;

public class Append {
    public static void main(String[] args) {
        HashSet<Object> a=new HashSet<>();
//        a.add(1);
//        a.add(2);
//        a.add(13);
//        a.add(14);
//        a.add(15);
//        a.add(28);
//        a.add(3);
//        a.add(9);
//        a.add(10);
//        a.add(11);
//        a.add(12);
//        a.add(29);
//        a.add(30);
        a.add("apple");
        a.add("banana");
        a.add("grape");
        a.add("kiwi");
        a.add("mango");
        a.add("orange");
        a.add("peach");
        a.add("pear");
        a.add("plum");
        a.add("watermelon");
        a.add("cherry");
        a.add("melon");
        a.add("apricot");
        a.remove("grape");
        System.out.print(a);
    }
}
