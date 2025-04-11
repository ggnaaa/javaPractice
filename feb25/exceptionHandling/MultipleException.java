package exceptionHandling;

import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st value: ");
        String a = sc.nextLine();
        int b = 10;
        try {
            int a1=Integer.parseInt(a);
            int c = a1 / b;
            System.out.println(c);
        }catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        sc.close();
    }
}
