package practice.collections.set.hastSet;

import java.util.HashSet;

public class Add {
    public static void main(String[] args) {
        HashSet<Object> a=new HashSet<>();
        a.add(3);
        a.add(10);
        a.add(32);
        a.add(0);
        a.add(18);
        a.add(32);
        System.out.println(a);
      //  System.out.println(32.hashCode() &;
    }
}
