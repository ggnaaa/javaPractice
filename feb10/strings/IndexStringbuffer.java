package feb10.strings;

import java.util.Scanner;

public class IndexStringbuffer {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter the string: ");
        String a=s.nextLine();

        StringBuffer sbf=new StringBuffer(a);
        System.out.println(sbf);

        System.out.print("enter the index: ");
        String b=s.nextLine();
//        Integer b=s.nextInt();

        System.out.print("enter the input: ");
        String c=s.nextLine();

        sbf.insert(Integer.parseInt(b), c);
        System.out.println("after insertion: " + sbf);
    }
}
