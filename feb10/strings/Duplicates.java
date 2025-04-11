package feb10.strings;

import java.util.Arrays;
import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the input: ");
        String a = s.nextLine();

        String[] b = a.split(" ");
        System.out.println(" " + Arrays.toString(b));

        String res = " ";

        for (int i = 0; i < b.length; i++) {
            if (!res.contains(b[i])) {
                res += b[i]+ " ";
            }
        }
        System.out.println(res.trim());
    }
}
