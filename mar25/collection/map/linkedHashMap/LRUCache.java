package mar25.collection.map.linkedHashMap;
//Implement LRU Cache using LinkedHashMap.
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);  // accessOrder = true → maintains access order
        this.capacity = capacity;
    }

    //removeEldestEntry is a inbuilt method in LinkedHashMap.
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;  // Remove the oldest if capacity exceeded
    }

    public static void main(String[] args) {
        LRUCache<java.lang.Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        System.out.println("Cache: " + cache);

        cache.get(2);
        System.out.println("After accessing 1: " + cache);

        cache.put(4, "Four");
        System.out.println("After adding 4: " + cache);

        cache.get(2);
        System.out.println("After accessing 3: " + cache);

        cache.put(5, "Five");
        System.out.println("After adding 5: " + cache);
    }
}
