package practice.day1;

import java.util.Scanner;
import java.lang.String;

public class Day {
    public static void main(String[] args) {
//        dec_init();
//        typeconvo();
//        ifelse();
//        max();
//        loop();
//        sc();
//        BC();

    }

    static void dec_init() {
        int num = 1;
        float f = 0.3f;
        char c = 'F';
        boolean b = true;
        System.out.println(num + "\n" + f + "\n" + c + "\n" + b);
    }

    static void typeconvo() {
        int a = 3;
        float f = (float) a;
        System.out.println(f);
//        double d= a;
//        System.out.println(f+"\n"+d);
        float f1 = 4.54F;
        int a1 = (int) f1;
        System.out.println(a1);
    }

    static void ifelse() {
        int num;
        System.out.println("Enter the integer: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if (num % 2 == 0)
            System.out.println("the " + num + " is even");
        else
            System.out.println("the " + num + " is odd");
        s.close();
    }

    static void max() {
        int w;
        int x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st integer: ");
        w = s.nextInt();
        System.out.print("Enter the 2nd integer: ");
        x = s.nextInt();
        int ma = w > x ? w : x;
        System.out.print("the max value out of this is:" + ma);

    }

    static void loop() {
        int i;
        int n;
        System.out.print("Enter the integer: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 0; i < n; i++)
            System.out.print(" " + i);
    }

    static void sc() {
        int n;
        System.out.print("Enter the integer: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        switch(n) {
            case 1:
                System.out.println("Good Morning");
                break;
            case 2:
                System.out.println("Good Afternoon");
                break;
            case 3:
                System.out.println("Good Night");
                break;
            default:
                System.out.print("choose a number between 1-3");
        }
        }

    static void BC() {
        int i;
        int n;
        System.out.print("Enter the integer: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 0; i < n; i++){
//            System.out.println(i);
        if (i == 3) {
            continue;
        }
            System.out.println(i);
        if (i >= 5) {
            break;
        }
    }
}
}



