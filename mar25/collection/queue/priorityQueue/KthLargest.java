package mar25.collection.queue.priorityQueue;

import java.util.*;
//Find the kth largest element in a stream using PriorityQueue.
public class KthLargest {
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>(Arrays.asList(2, 5, 7, 9, 15));
        System.out.println("List: " + a);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the k value: ");
        int k = sc.nextInt();

        if (k <= 0 || k > a.size()) {
            System.out.println("Invalid value of k");
            return;
        }

        PriorityQueue<Integer> b = new PriorityQueue<>(k);
        for (int num : a) {
            b.add(num);
            if (b.size() > k) {
                b.poll();
            }
        }
        System.out.println("The " + k + "th largest element is: " + b.peek());
        sc.close();
    }
}
