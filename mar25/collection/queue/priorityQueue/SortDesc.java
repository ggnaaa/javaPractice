package mar25.collection.queue.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//Create a priority queue that sorts elements in descending order.
public class SortDesc {
    public static void main(String[] args) {
        Queue<Integer> a=new PriorityQueue<>(Collections.reverseOrder());
        a.add(4);
        a.add(6);
        a.add(3);
        a.add(9);
        a.add(2);
        System.out.println(a);
        while (!a.isEmpty()) {
            System.out.print(a.poll() + " ");
        }
    }
}
