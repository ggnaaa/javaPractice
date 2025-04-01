package mar25.collection.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
//Find the first non-repeating character in a string using LinkedHashMap.
public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "bottle";

        // Find the first non-repeating character
        char result = FirstNonRepeatingChar(str);

        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char FirstNonRepeatingChar(String str) {
        Map<Character, Integer> a = new LinkedHashMap<>();

        // 1. Count character frequencies
        for (char ch : str.toCharArray()) {
            a.put(ch, a.getOrDefault(ch, 0) + 1);
        }

        // 2. Find the first character with a frequency of 1
        for (Map.Entry<Character, Integer> entry : a.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
