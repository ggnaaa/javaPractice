package mar25.collection.list.linkedList;

import java.util.LinkedList;
import java.util.List;
//Reverse a LinkedList without using built-in methods.
public class Reverse {
    public static void main(String[] args) {
        List<Integer> a=new LinkedList<>();
        a.add(2);
        a.add(4);
        a.add(1);
        a.add(8);
        a.add(6);
        System.out.println(a);
        List<Integer> b=new LinkedList<>();
        for(int i=a.size()-1;i>=0;i--){
            b.add(a.get(i));
        }
        System.out.println(b);
    }
}
