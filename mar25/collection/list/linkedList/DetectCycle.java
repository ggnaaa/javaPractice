package mar25.collection.list.linkedList;

import java.util.Arrays;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectCycle {

    public static boolean hasCycle(Node head) {

        // Edge case: empty or single node
        System.out.println(head);
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;       // Moves 1 step
        Node fast = head;       // Moves 2 steps

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow by 1 step
            fast = fast.next.next;     // Move fast by 2 steps

            if (slow == fast) {
                return true;           // Cycle detected
            }
        }
        return false;                  // No cycle
    }

    public static void main(String[] args) {

        // Create a LinkedList with a cycle
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);

        // Create a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        System.out.println("Cycle exists: " + hasCycle(head));  // Output: true

        // Create a LinkedList without a cycle
        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);

        System.out.println("Cycle exists: " + hasCycle(head2));  // Output: false
    }
}
