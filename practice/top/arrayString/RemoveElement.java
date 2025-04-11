package practice.top.arrayString;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        int b = 2;
        removeElement(a, b);
    }

    public static void removeElement(int[] nums, int val) {
        int count = 0;
        for (int num : nums) {
            if (num == val) {
                count++;
            }
        }

        int[] newArray = new int[nums.length - count];
        int index = 0;
        for (int i: nums) {
            if (i != val) {
                newArray[index++] = i;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}

