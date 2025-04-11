package practice.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args){
        List a=new ArrayList();
        a.add(1);
        a.add(14);
        a.add(6);
        a.add(12);
        a.add(8);
        a.add(3);
        Collections.sort(a);
        System.out.println(a);
    }
}
