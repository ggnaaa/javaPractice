package practice.collections.map.hashMap;

import java.util.HashMap;

public class Operations {
    public static void main(String[] args) {
        HashMap<Integer, String> a = new HashMap<>();
        a.put(1, "Apple");
        a.put(2, "Banana");

        HashMap<Integer, String> b = new HashMap<>();
        b.put(3, "Guava");
        b.put(4, "Berry");

        a.putAll(b); // to merge two maps.
        System.out.println(a);

        System.out.println(b.get(3));
    }
}
