package feb12;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        int[] a = {13, 12, 23, 4, 56, 67};
        Scanner s = new Scanner(System.in);
        System.out.print("enter the element u wanna check: ");
        Integer q = s.nextInt();
        for (int i = 0; i < a.length - 1; i++) {
            if (q == a[i]) {
                System.out.println("yes it has " + a[i]);
            }
        }
    }
}
