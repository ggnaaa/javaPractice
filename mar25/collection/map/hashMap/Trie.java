package mar25.collection.map.hashMap;

import java.util.*;
//Implement a Trie (Prefix Tree) using HashMap.
public class Trie {

    // Trie Node class
    static class TrieNode {
        Map<Character, TrieNode> children;  // Map of child nodes
        boolean isEndOfWord;                // Marks the end of the word

        TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }

    // Trie class
    static class trie {
        private final TrieNode root;

        trie() {
            root = new TrieNode();
        }

        // Insert a word into the Trie
        public void insert(String word) {
            TrieNode current = root;

            for (char c : word.toCharArray()) {
                current = current.children.computeIfAbsent(c, k -> new TrieNode());
            }

            current.isEndOfWord = true;
        }

        // Search for a word
        public boolean search(String word) {
            TrieNode current = root;

            for (char c : word.toCharArray()) {
                if (!current.children.containsKey(c)) {
                    return false;   // Character not found
                }
                current = current.children.get(c);
            }

            return current.isEndOfWord;   // Check if it's the end of a word
        }

        // Search for a prefix
        public boolean startsWith(String prefix) {
            TrieNode current = root;

            for (char c : prefix.toCharArray()) {
                if (!current.children.containsKey(c)) {
                    return false;
                }
                current = current.children.get(c);
            }

            return true;   // Prefix exists
        }
    }

    public static void main(String[] args) {
         trie t = new trie();

        // Inserting words
        t.insert("cat");
        t.insert("car");
        t.insert("dog");
        t.insert("dot");

        System.out.println("Search 'cat': " + t.search("cat"));       // true
        System.out.println("Search 'cap': " + t.search("cap"));       // false
        System.out.println("Prefix 'c': " + t.startsWith("c"));     // true
        System.out.println("Prefix 'do': " + t.startsWith("do"));     // true
        System.out.println("Prefix 'da': " + t.startsWith("da"));     // false
    }
}
