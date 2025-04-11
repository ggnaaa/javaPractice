package practice.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        mergesort();
    }
    public static void mergesort(){
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(0);
        nums1.add(0);
        nums1.add(0);
        int m = nums1.size();
        System.out.println(nums1);

        for (int i =1;i<nums1.size();i++) {
            if (nums1.get(i) == 0) {
                nums1.remove(i);
                i--;
            }
        }
        System.out.println(nums1);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(2);
        nums2.add(5);
        nums2.add(6);
        int n=nums2.size();
        System.out.println(nums2);


        nums1.addAll(nums2);
        System.out.println(nums1);
    }
}
