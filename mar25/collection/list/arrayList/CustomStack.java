package mar25.collection.list.arrayList;

import java.util.ArrayList;
//Implement a custom stack using ArrayList.
public class CustomStack {
    private ArrayList<Integer>  stack;

    // Constructor
    public CustomStack() {
        stack = new ArrayList<>();
    }

    // Push method (add element to stack)
    public void push(int value) {
        stack.add(value);
        System.out.println(value + " pushed to stack.");
    }

    // Pop method (remove and return the top element)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;  // Indicates stack is empty
        }
        int removed = stack.remove(stack.size() - 1);
        System.out.println(removed + " popped from stack.");
        return removed;
    }

    // Peek method (return the top element without removing it)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    // isEmpty method (check if stack is empty)
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // size method (get the number of elements in stack)
    public int size() {
        return stack.size();
    }

    // Display all elements in the stack
    public void display() {
        System.out.println("Stack elements: " + stack);
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        // Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display stack elements
        stack.display();

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements
        stack.pop();
        stack.display();

        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
