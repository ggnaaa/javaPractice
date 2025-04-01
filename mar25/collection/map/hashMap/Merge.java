package mar25.collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;

//Merge two HashMaps and handle duplicate keys.
public class Merge {
    public static void main(String[] args) {
        Map<String, Integer> a = new HashMap<>();
        a.put("a", 4);
        a.put("b", 6);
        a.put("c", 2);
        System.out.println("a: " + a);
        Map<String, Integer> b = new HashMap<>();
        b.put("d", 8);
        b.put("c", 4);
        b.put("e", 4);
        System.out.println("b: " + b);
        b.putAll(a);
        System.out.println("put all: " + b);

        Map<String, Integer> c = new HashMap<>(a);
        for (Map.Entry<String, Integer> i : b.entrySet()) {
            c.put(i.getKey(), c.getOrDefault(i.getKey(), 0) + i.getValue());
        }
        System.out.println("c: " + c);
    }
}
