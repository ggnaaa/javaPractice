package feb10.strings;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the input: ");
        String a = s.nextLine();

        char[] c = a.toCharArray();

        for (int i = 0; i < c.length; i++) {
            int count = 1;
            if (c[i] != ' ') {
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i] == c[j]) {
                        count++;
                        c[j] = ' ';
                    }
                }
                // Print the frequency of the character
                System.out.println(c[i] + ": " + count);
            }
        }
    }
}

