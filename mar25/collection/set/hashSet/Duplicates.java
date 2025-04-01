package mar25.collection.set.hashSet;

import java.util.HashSet;
//Create a HashSet and add duplicate values. Observe the output.
public class Duplicates {
    public static void main(String[] args) {
        HashSet<Object> a=new HashSet<>();
        a.add(3);
        a.add(16);
        a.add(32);
        a.add(32);
        a.add(18);
        a.add(0);
        System.out.println(a);
    }
}
