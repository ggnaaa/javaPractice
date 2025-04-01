package mar25.collection.map.hashMap;

import java.util.*;

public class SortByValues {
    public static void main(String[] args) {
        HashMap<String, Integer> a=new HashMap<>();
        a.put("a",2);
        a.put("b",3);
        a.put("c",1);
        System.out.println(a);
        Map<String, Integer> sortedMap = sortByValue(a);
        System.out.println("Sorted Map by Values: " + sortedMap);

    }

    private static Map<String, Integer> sortByValue(HashMap<String, Integer> a) {
        //convert map into list entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(a.entrySet());

        // Sort the list based on values
         Collections.sort(list, (e1,e2) -> e1.getValue().compareTo(e2.getValue())); // lambda expression

        //without lambda expression.
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
//                return e1.getValue().compareTo(e2.getValue());  // Ascending order
//            }
//        });

        // Create a LinkedHashMap to store sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
