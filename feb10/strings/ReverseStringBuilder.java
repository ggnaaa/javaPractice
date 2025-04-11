package feb10.strings;

import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the string: ");
        String a=s.nextLine();
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        System.out.println(sb);
    }
}
