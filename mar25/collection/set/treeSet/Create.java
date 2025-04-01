package mar25.collection.set.treeSet;

import java.util.TreeSet;
//Create a TreeSet and store numbers. Observe how it maintains order.
public class Create {
    public static void main(String[] args) {
        TreeSet<Object> a=new TreeSet<>();
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(8);
        a.add(0);
        System.out.println(a);
    }
}
