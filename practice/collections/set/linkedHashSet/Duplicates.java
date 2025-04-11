package practice.collections.set.linkedHashSet;

import java.util.*;

//Given an array, find all duplicate elements using Set.
public class Duplicates {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        int[] a = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(a));
        //remove duplicates using LinkedHashset.
        LinkedHashSet<Integer> b = new LinkedHashSet<>();
        for (int i : a) {
            if (b.contains(i)) {
                c.add(i);
            } else {
                b.add(i);
            }
        }
        System.out.println(b);
        System.out.println("the duplicates present here r: "+c);
    }
}
