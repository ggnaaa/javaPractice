package feb12;

import java.util.Arrays;
// to merge u can use
//arraycopy, concat,
public class Merge {
    public static void main(String[] args) {
        int[] a = {13, 12, 58, 23, 4, 56, 67};
        int[] b = {3, 6, 12, 34, 45, 45};

        int[] mergedArray = merge1(a, b);

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    static int[] merge1(int[] a, int[]b) {
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        //using arraycopy.
        int[] merged = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b,0,merged, a.length, b.length);
//        System.out.println(Arrays.toString(merged));
        return merged;
    }
}



