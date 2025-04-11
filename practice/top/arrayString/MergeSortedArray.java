package practice.top.arrayString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a= {1,2,3,0,0,0};
        int[] b = {2,5,6};
        int[] c= new int[0];
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                c = Arrays.copyOf(c, c.length + 1);  // Increase the size by 1
                c[c.length - 1] = a[i];        // Add the new element
            }
        }
//        System.out.println(Arrays.toString(c));
        for(int i=0;i<b.length;i++){
            if(b[i]!=0){
                c = Arrays.copyOf(c,c.length+1);
                c[c.length - 1] = b[i];
            }
        }
        System.out.println(Arrays.toString(c));

    }
}
