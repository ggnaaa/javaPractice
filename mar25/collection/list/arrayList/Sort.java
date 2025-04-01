package mar25.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Sort an ArrayList of integers in ascending and descending order.
public class Sort {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(5);
        a.add(8);
        a.add(0);
        System.out.println(a);
        //ascending
        Collections.sort(a);
        System.out.println("ascend- "+a);
        //descending
        Collections.sort(a);
        Collections.reverse(a);
        System.out.println("descend- "+a);
    }
}
