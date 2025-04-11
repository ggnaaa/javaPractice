package feb10.strings;

import java.util.Scanner;

public class Rotations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1st input: ");
        String str1 = s.nextLine();

        System.out.print("2nd input: ");
        String str2 = s.nextLine();

        boolean result = areRotations(str1, str2);
        System.out.println(result);
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        return (str1+str1).contains(str2);
    }
}


