package practice.collections.queue.deque;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> a=new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        for(int i=a.size();i>0;i--){
            System.out.println( );
        }
    }
}
