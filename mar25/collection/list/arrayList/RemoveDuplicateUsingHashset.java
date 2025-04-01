package mar25.collection.list.arrayList;

import java.util.*;

//Remove duplicates from an ArrayList using a HashSet.
public class RemoveDuplicateUsingHashset {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(5);
        a.add(3);
        a.add(4);
        a.add(7);
        System.out.println(a);
        HashSet<Integer> b=new HashSet<>();
        for(int i=0;i<a.size();i++){
            b.add(a.get(i));
        }
        System.out.println(b);
    }
}
