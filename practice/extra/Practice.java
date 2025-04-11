package practice.extra;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        square();
//        sum();
        index();
    }

    public static void square() {
        int a = 6;
        for (int i = 0; i < a; i++) { //for rows
            for (int j = 0; j < a; j++) { //for columns
                if (i == 0 || j == 0 || i == a - 1 || j == a - 1) { // to print square
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void sum() {
        int[] a = {2, 3, 5, 7, 8};
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int i1 = sum;
            sum += a[i];
            System.out.println(i1 + "+" + a[i] + "=" + sum);
        }
        System.out.println("total:" + sum);
    }

    // Write a Java program to find the index of an array element.
    public static void index() {
        int[] a = {2, 3, 1, 4, 5, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value u wanna check: ");
        int b = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (b == a[i]) {
                System.out.println("yes the value is present in index position " + a[i]);
                flag = true;
                break;
//                a[i] = a[i + 1];
            }
        }
        if(!flag){
            System.out.println("No such value is present in the array");
        }
    }
}




