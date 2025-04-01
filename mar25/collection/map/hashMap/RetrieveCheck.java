package mar25.collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;
//Use a HashMap to store student names (key) and marks (value), then retrieve a value.
//Check if a given key exists in a HashMap.
public class RetrieveCheck {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ana", 38);
        map.put("ava", 45);
        map.put("cia", 48);
        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.getOrDefault("ava",1));
//        if (map.containsKey("sakshi")) {
        if(map.containsValue(38)){
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }
        //to check the character of the key
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().contains("i")) {   // Check for partial match
                System.out.println("Partial match found: " + entry.getKey());
            }
        }
    }
}
