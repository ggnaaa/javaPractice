package practice.top.arrayString;

import java.util.ArrayList;
import java.util.Objects;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a={0,0,0,1,1,1,2,2,3,3,4};
        removeduplicates(a);
    }
    static void removeduplicates(int[] a){
        ArrayList<String> c=new ArrayList<>();
        int count=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]) {
                count++;
            }else{
                if(!c.contains(String.valueOf(a[i]))){
                    c.add(String.valueOf(a[i]));
                }
            }
        }
        for(int i=0;i<=count;i++){
            c.add("_");
        }
        System.out.println(c);
    }
}
