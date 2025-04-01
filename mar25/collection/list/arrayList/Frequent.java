package mar25.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
//Find the most frequently occurring element in an ArrayList.
public class Frequent{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 2, 2, 3, 2, 4, 4, 5, 6, 7);

        int mostFrequent = findMostFrequent(list);

        System.out.println("Most frequently occurring element: " + mostFrequent);
    }

    public static int findMostFrequent(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return -1;
        }
        Collections.sort(list);

        int maxFrequency = 1;
        int currentFrequency = 1;
        int mostFrequentElement = list.get(0);
//        System.out.println(mostFrequentElement);

        // Step 2: Iterate through the sorted list to count occurrences
        for (int i:list) {
            if (list.get(i).equals(list.get(i - 1))) {
                currentFrequency++;
            } else {
                currentFrequency = 1;
            }

            // Update the most frequent element
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentElement = list.get(i);
            }
        }
        return mostFrequentElement;
    }
}
