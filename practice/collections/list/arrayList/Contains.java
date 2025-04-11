package practice.collections.list.arrayList;

import java.util.*;

public class Contains {
    public static void main(String[] args) {
        List<String> b= Arrays.asList("gagana","sakshi c","hemanth"); // Arrays.asList wont let u do modification but let u iterate and use.
//         List<List<String>> singleton = Collections.singletonList(b);
        System.out.println("b print me "+b);
       List<String> c= new ArrayList<>();
       c.add("gagana");
       c.add("sakshi");
        System.out.println(b);

//    //   c.addAll(b);
//        System.out.println(c);
//        c.remove(1);
//        System.out.println(c);
////        //b.addAll(c);
//        System.out.println(c);
//      b.remove(1);
//        System.out.println(c);
        int a=9;
        if(b.contains(a)){
            System.out.println("it has this value in list");
        }else{
            System.out.println("no value as such is found in list");
        }
    }
}
