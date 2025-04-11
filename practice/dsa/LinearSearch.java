package practice.dsa;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(65);
        a.add(34);
        a.add(3);
        a.add(6);
        a.add(1);
        a.add(90);
        a.add(8);
        Collections.sort(a);
        System.out.println(a);
        System.out.println("-----------------------------------");

        //linear search
        for (int i = 1; i < a.size() - 1; i++) {
            if (a.get(i)==8) {
                System.out.println(i+"th index has "+a.get(i));
            }
        }
    }
}
