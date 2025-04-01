package mar25.collection.map.hashMap;

import java.util.*;
//Find all anagrams in a list of words using HashMap.
public class Anagrams {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> a = new HashMap<>();

        for (String word : words) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sortedword = new String(c);

            a.computeIfAbsent(sortedword, K -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(a.values());
    }

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live"};
        List<List<String>> anagrams = groupAnagrams(words);
//        System.out.println(anagrams);
        for (List<String> group : anagrams) {
            System.out.println(group);
        }
    }
}
