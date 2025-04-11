package practice.collections.map.hashMap;

import java.util.*;

//Find the Most Frequent Element in a List using HashMap
public class MostFrequent {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("apple", "cherry", "banana", "apple", "apple", "banana", "banana");
        Map<String, Integer> map = new HashMap<>();
        for (String item : a) {
            System.out.print(item+", ");
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        System.out.println();
        int maxFrequency = Collections.max(map.values());
        System.out.println("Most frequent elements");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(" bucket index "+ (entry.getKey().hashCode()&15
            ));
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey() + " (Frequency: " + entry.getValue() + ")");
            }
        }
    }
}
