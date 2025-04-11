package practice.collections.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

////Implement LRU Cache using LinkedHashMap.
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity,0.7f,true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return size()>capacity;
    }

//    public V get(Object key){
//        return super.getOrDefault(key, null);
//    }
//
//    public V put(K key,V value){
//        super.put(key, value);
//        return value;
//    }

    public static void main(String[] args) {
        LRUCache<Integer, String> a = new LRUCache<>(4);
        a.put(3,"A");
        a.put(1,"B");
        a.put(2,"C");
        System.out.println(a);

        a.get(1);
        System.out.println(a);
        a.put(1,"R");
        System.out.println(a);
        a.put(4,"T");
        System.out.println(a);
        a.put(5,"A");
        System.out.println(a);
        a.get(1);
        a.get(4);
        System.out.println(a);
    }
}
