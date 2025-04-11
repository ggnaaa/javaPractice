package practice.exceptions;

import java.util.Scanner;

//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
public class ExceptionIfOdd {
    public static void main(String[] args) throws Exception {
       odd();

    }
    static class OddException extends Exception {
        public OddException(String msg) {
            super(msg);
        }
    }
    public static void odd() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        try {
            int a = sc.nextInt();
            if (a % 2 != 0) {
                throw new OddException("the number sld be even");
            }
            System.out.println("the number "+a+" is even");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }finally{
            System.out.println("end");
        }
    }


}
