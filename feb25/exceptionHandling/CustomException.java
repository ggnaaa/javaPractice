package exceptionHandling;

import java.util.Scanner;

// Step 1: Define the custom exception
class NegativeAgeException extends Exception {
    public NegativeAgeException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }
            System.out.println("Your age is: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
