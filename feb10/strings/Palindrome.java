package feb10.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the input: ");

        String s = c.nextLine();
//        System.out.println(s);
        boolean result = isPalindrome(s);

        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        String q = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = q.length() -1 ;

        while (left < right) {
            if (q.charAt(left) != q.charAt(right)) {
//                System.out.println(q);
                return false;
            }
            left++;
            right--;
        }
//        System.out.println(q);
        return true;
    }
}


