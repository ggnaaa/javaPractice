package feb12;

import java.util.Arrays;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] c = {13, 4, 13, 4, 56, 67};
        Arrays.sort(c);
        for (int i = 0; i <= c.length - 1; i++) {
            int count = 1;
            if (i > 0 && c[i] == c[i-1]) {
                continue;
            }
            for (int j = i + 1; j <= c.length-1; j++) {
                if (c[i] == c[j]) {
                    count++;
                }
            }
            System.out.println(c[i]+":"+count);
        }
    }
}


