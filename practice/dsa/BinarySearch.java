package practice.dsa;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
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
        //binary search
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the element u wanna search: ");
        int w=sc.nextInt();
        int start = a.size() / 2;
        if (w < a.get(start)) {
            for (int i = start; i > 0; i--) {
                if (a.get(i) == w) {
                    System.out.println("found "+a.get(i)+" in " + i + "th index");
                }
            }
        } else {
            for (int i = start; i < a.size() - 1; i++) {
                if (a.get(i) == w) {
                    System.out.println("found "+a.get(i)+" in " + i + "th index");
                }
            }
        }
    }
}
