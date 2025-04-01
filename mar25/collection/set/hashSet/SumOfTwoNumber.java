package mar25.collection.set.hashSet;

import java.util.HashSet;
import java.util.Set;

//Find pairs in an array whose sum is equal to a given number using HashSet.
public class SumOfTwoNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int given = 6;

        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == given) {
                    pairs.add("(" + a[i] + ", " + a[j] + ")");
                } else if (a[i]+a[i]==given) {
                    pairs.add("(" + a[i] + ", " + a[i] + ")");
                }
            }
        }

        System.out.println(pairs);

    }
}
