package practice.collections.set.treeSet;

// Definition for a binary tree node
public class MaxDepth {
    int val;
    MaxDepth left;
    MaxDepth right;

    // Constructor with a value
    public MaxDepth(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        // Example to test the solution
        MaxDepth root = new MaxDepth(3);
        root.left = new MaxDepth(9);
        root.right = new MaxDepth(20);
        root.right.left = new MaxDepth(15);
        root.right.right = new MaxDepth(7);

        Solution solution = new Solution();
        System.out.println("Maximum Depth: " + solution.maxDepth(root));
    }
}

class Solution {
    public int maxDepth(MaxDepth root) {
        // Base case: if the tree is empty, return depth 0
        if (root == null) {
            return 0;
        }

        // Recursively find the maximum depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int maxx=Math.max(leftDepth, rightDepth);
        // The depth of the current tree is 1 + the maximum of the left and right subtree depths
        return maxx + 1;
    }
}
