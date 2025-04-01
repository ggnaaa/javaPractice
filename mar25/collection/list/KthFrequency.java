package mar25.collection.list;

import java.util.*;
//Find the top K frequent words in a list of strings.
public class KthFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "camel", "cat", "horse", "dog", "cat", "cat");
        int k = 2;

        // Step 1: Count the frequency of each word
        Map<String, Integer> a = new HashMap<>();
        for (String word : words) {
            a.put(word, a.getOrDefault(word, 0) + 1);
        }

        var result = getStrings(a, k);
        Collections.reverse(result);  // To get the most frequent first

        // Print the top K frequent words
        System.out.println("Top " + k + " frequent words: " + result);
    }

    private static List<String> getStrings(Map<String, Integer> a, int k) {
        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> {
            int freqCompare = a.get(w1) - a.get(w2); // Compare by frequency
            return freqCompare != 0 ? freqCompare : w2.compareTo(w1);  // Tie: reverse alphabetical order
        });

        // Add words to the heap
        for (String word : a.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();  // Remove least frequent
        }

        // Step 3: Extract from the heap and reverse the order
        List<String> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.poll());
        }
        return result;
    }
}
