package practice.collections.list.linkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Object> a = new LinkedList<Object>();
        a.add("ef");
        a.add(1);
        a.add(5);
        a.add("vgfwvhbedf");
        a.add("hey bbygirl");
        a.add("blah blah");
        System.out.println(a);
        System.out.println("--------------------------------------------------");

        //Write a Java program to iterate through all elements in a linked list.
        for (int i = 2; i <= a.size() - 1; i++) {
            System.out.print(a.get(i) + ", ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        //Write a Java program to iterate a linked list in reverse order.
        for (int i = a.size() - 1; i >= 0; i--) {
            System.out.print(a.get(i) + ", ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        //to remove element from linked list.
        a.remove(3);

        //Write a Java program to insert the specified element at the specified position in the linked list.
        a.add(4,"haha");
        System.out.println(a);
    }
}
