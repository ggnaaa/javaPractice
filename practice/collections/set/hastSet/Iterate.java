package practice.collections.set.hastSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Iterate {
    public static void main(String[] args) {
        HashSet<Integer> a=new HashSet<>();
        //if it's a small set of Integer value it will automatically get sorted..
        a.add(1);
        a.add(6);
        a.add(0);
        a.add(4);
        a.add(5);
        System.out.println(a);
        //iterate in hashset can be done in following ways.
        //using enhanced for loop.
        System.out.print("using enhaced for loop: ");
        for (Object num : a) {
            System.out.print(num+", ");
        }
        System.out.println();
        //by creating a list to assign index for the element in hashset.
        List<Integer> b=new ArrayList<>(a);
        System.out.print("using arraylist: ");
        for(int i=0;i<a.size();i++){
            System.out.print(b.get(i)+", ");
    }
        System.out.println();
        //using iterator.
        Iterator<Integer> iterator = a.iterator();
        System.out.print("using iterator: ");
        while (iterator.hasNext()){
            Integer e = iterator.next();  // Retrieves the next element
            System.out.print(e+", ");
        }
    }
}
