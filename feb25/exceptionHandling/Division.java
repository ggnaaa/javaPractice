package exceptionHandling;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("1st value: ");
        int a=sc.nextInt();
        System.out.print("2nd value: ");
        int b= sc.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }

    }
}
