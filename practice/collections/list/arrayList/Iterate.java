package practice.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Iterate {
    public static void main(String[] args) {
        List a=new ArrayList(); //creating and arraylist
        a.add(1); // to add the elements to arraylist
        a.add(2);
        a.add("hii");
        a.add('A');
        a.remove(0); // to remove an specific element using index value
        a.set(1, "blah blah blah"); //update
        a.add(1,"hey babygirl"); // to add element in specific index value
        System.out.println(a.get(1)); // to print specific element using index
        for(int i=0;i<a.size();i++){ // to iterate to print all the elements in arraylist
            System.out.print(a.get(i)+", ");
        }
        System.out.println();
        // contains.
            if (a.contains("hey babygirl")) {
                System.out.println("yes");
            }else{
                System.out.println("no");
        }
    }
}
