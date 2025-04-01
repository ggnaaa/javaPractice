package mar25.collection.list;

import java.util.ArrayList;
import java.util.List;

//Remove all elements from a collection that satisfy a condition (e.g., remove odd numbers from a list).
public class RemoveElements {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(5);
        a.add(2);
        a.add(6);
        a.add(8);
        a.add(9);
        a.add(0);
        a.add(13);
        System.out.println(a);
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i)%2!=0) {
                a.remove(a.get(i));
            }
        }
        System.out.println(a);
    }
}
