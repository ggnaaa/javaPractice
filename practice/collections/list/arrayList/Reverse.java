package practice.collections.list.arrayList;

import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(100,2,3,4,5);

        for (Integer value:a)
        {
            System.out.print(value+", ");
        }
        System.out.println();
        for(int i=a.size()-1;i>=0;i--){
            System.out.print(a.get(i)+", ");
        }

    }
}
