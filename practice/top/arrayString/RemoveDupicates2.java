package practice.top.arrayString;

public class RemoveDupicates2 {
    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 1, 2, 3, 3, 3};

        int index = 2; // since we want to print "_" after 2 elements
        for (int i = 2; i < a.length; i++) {
            if (a[i] != a[index - 2]) {
                a[index++] = a[i];
            }
        }

        // Print the result
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i < index ? a[i] : "_");
            if (i < a.length - 1)
                  System.out.print(", ");
        }
        System.out.println("]");
    }
    }

