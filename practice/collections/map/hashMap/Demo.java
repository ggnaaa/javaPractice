package practice.collections.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 3);
        map.put("cherry", 1);
        System.out.println(map);
    }
}
