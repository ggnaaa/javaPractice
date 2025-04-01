package mar25.collection.list.linkedList;

import java.util.LinkedList;
import java.util.List;
//Use a LinkedList to add elements at the beginning, middle, and end.
public class Add {
    public static void main(String[] args) {
        List<Integer> a=new LinkedList<>();
        a.add(2);
        a.add(6);
        a.add(4);
        a.add(4);
        a.add(1,3);
        a.add(0,0);
        int b=a.size();
        a.add(b,9);
        System.out.println(a);
    }
}
