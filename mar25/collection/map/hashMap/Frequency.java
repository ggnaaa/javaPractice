package mar25.collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;
//Find the frequency of each character in a string using HashMap.
public class Frequency {
    public static void main(String[] args) {
        String sentence = "dandadan";
        String[] words = sentence.split("");

        Map<String, Integer> a = new HashMap<>();
        for (String word : words) {
            a.put(word, a.getOrDefault(word, 0) + 1);
        }

        // Print the frequency
        for (Map.Entry<String, Integer> b : a.entrySet()) {
            System.out.println(b.getKey() + " : " + b.getValue());
        }
    }
}

