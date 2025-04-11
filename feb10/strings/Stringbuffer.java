package feb10.strings;

import java.util.Scanner;

public class Stringbuffer {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter the ist input: ");
        String a=s.nextLine();

        StringBuffer sbf = new StringBuffer(a);
        String c=sbf.toString();
        System.out.println(c);

        System.out.print("enter the 2nd input: ");
        String b=s.nextLine();

        sbf.append(" "+b);
        System.out.println(sbf);

    }
}
