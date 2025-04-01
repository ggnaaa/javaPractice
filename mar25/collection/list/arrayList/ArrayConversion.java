package mar25.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Convert an ArrayList to an array and vice versa.
public class ArrayConversion {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 3, 4, 5, 2);
        System.out.println(a);
        //ArrayList to Array.
        Integer[] b = a.toArray(new Integer[0]);
        System.out.println("Array: "+Arrays.toString(b));

        //Array to ArrayList.
        List<Integer> c=Arrays.asList(b);
        System.out.println("arraylist: "+c);
        Collections.sort(c);
    }
}
